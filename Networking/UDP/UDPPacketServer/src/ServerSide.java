
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.TimeUnit;

public class ServerSide {

    private static final int PORT = 5000;
    private static final int PACKET_SIZE = 1024;

    public static void main(String[] args) {

        try (DatagramSocket serverSocket = new DatagramSocket(PORT)) {

            byte[] buffer = new byte[PACKET_SIZE];

            System.out.println("Waiting for client to connect...");
            DatagramPacket clientPacket = new DatagramPacket(buffer, buffer.length);
            serverSocket.receive(clientPacket);
            String audioFileName = new String(buffer, 0, clientPacket.getLength());
            System.out.println("Client requested to listen to: " + audioFileName);

            try {
                File audioFile = new File(audioFileName);
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
                System.out.println(audioInputStream.getFormat());//returns the sample size,bytes,frames/channel,sample rate

            } catch (UnsupportedAudioFileException e) {
                System.out.println(e.getMessage());
            }

            sendDataToClient(audioFileName, serverSocket, clientPacket);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void sendDataToClient(String file, DatagramSocket serverSocket,
                                         DatagramPacket clientPacket) {

        ByteBuffer buffer = ByteBuffer.allocate(PACKET_SIZE);//internally,it follows byte array and allocat() represnts capacity/size

        try (FileChannel fileChannel = FileChannel.open(Paths.get(file),
                StandardOpenOption.READ);//the given will convert to Path by Paths.get(file) and StandardOpenOption.READ enables the read only Operation

        ) {
            InetAddress clientIP = clientPacket.getAddress();//This line retrieves the IP address of the client that sent the packet.
            int clientPort = clientPacket.getPort();// This line retrieves the port number on the client’s machine from which the packet was sent.

            while (true) {
                buffer.clear();
                if (fileChannel.read(buffer) == -1) {
                    //Purpose: Reads data from the FileChannel into the buffer. If the method returns -1,
                    // it indicates that the end of the file has been reached. In this case, the loop is exited using break.
                    break;
                }

                buffer.flip();
                // Prepares the buffer for reading by setting the limit to the current position (the number of bytes read) and resetting the position to 0.
                // This is necessary to read the data that has just been written to the buffer.

                while (buffer.hasRemaining()) {
                    //Starts a loop that continues as long as there are remaining bytes in the buffer that can be read.
                    byte[] data = new byte[buffer.remaining()];
                    buffer.get(data);
                   // Reads the remaining bytes from the buffer into the data array. The position of the buffer is automatically updated.
                    DatagramPacket packet = new DatagramPacket(data,
                            data.length, clientIP, clientPort);
                    serverSocket.send(packet);
                }

                try {
                    TimeUnit.MILLISECONDS.sleep(4);
                    // This block pauses the execution of the thread for 5 milliseconds to prevent overwhelming the client with packets (throttling).
                    // If the thread is interrupted during the sleep, it catches the InterruptedException and exits the loop.

                } catch (InterruptedException e) {
                   break;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
