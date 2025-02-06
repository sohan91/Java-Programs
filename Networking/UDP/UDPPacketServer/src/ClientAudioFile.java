
import javax.sound.sampled.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ClientAudioFile {

    private static final int SERVER_PORT = 5000;
    private static final int PACKET_SIZE = 1024;

    public static void main(String[] args) {

        try (DatagramSocket clientSocket = new DatagramSocket()) {

            byte[] audioFileName = "C:\\Users\\Sohan\\Downloads\\All Hail The Tiger (1).wav".getBytes();
            DatagramPacket packet1 = new DatagramPacket(audioFileName,
                    audioFileName.length, InetAddress.getLocalHost(), SERVER_PORT);
            clientSocket.send(packet1);
            playStreamedAudio(clientSocket);
        } catch (IOException | LineUnavailableException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void playStreamedAudio(DatagramSocket clientSocket)
            throws SocketException, LineUnavailableException {

        clientSocket.setSoTimeout(2000);
        //Sets a timeout of 2000 milliseconds (2 seconds) for the clientSocket. If no packet is received within this time frame,
        // a SocketTimeoutException will be thrown, allowing the program to handle the situation appropriately.
        AudioFormat format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, // Encoding
                44100,                        // Sample rate
                16,                              // Sample size in bits
                2,                               // Channels (stereo)
                4,                               // Frame size
                44100,                        // Frame rate
             false );
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
        //Creates a DataLine.Info object that describes the type of audio line (SourceDataLine) and the audio format to be used.
        // This is necessary for obtaining an appropriate audio line from the audio system.
        SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);
        // Requests and retrieves a SourceDataLine (an output line for playing audio) that matches the specified DataLine.Info.
        // This line will be used to play audio data.
        line.open();
        //Purpose: Opens the audio line, making it ready for use. It allocates any necessary resources for playback.
        line.start();
// Starts the audio line, allowing it to begin playing audio data as it is written to it.
        byte[] buffer = new byte[PACKET_SIZE];
        //Creates a byte array named buffer with a size defined by PACKET_SIZE.
        // This buffer will temporarily hold the audio data received from the network.
        while (true) {
            try {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                //Creates a new DatagramPacket using the buffer to hold incoming data and specifying the buffer's length.
                clientSocket.receive(packet);
                //Calls clientSocket.receive(packet) to wait for an incoming packet. This method blocks until a packet is received, or until the timeout (set earlier) occurs.

                line.write(buffer, 0, packet.getLength());
                //Writes the audio data from the buffer to the SourceDataLine for playback. The method uses packet.getLength() to determine how many bytes of data to write.
            } catch (IOException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        line.close();
        // Closes the SourceDataLine, releasing any resources it holds and stopping audio playback cleanly when the loop exits.
    }
}
