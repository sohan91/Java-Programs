import javax.naming.TimeLimitExceededException;
import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class DatagramChannelServer {
    private static final int PORT = 5000;
    private  static  final int PORT_SIZE = 1024;
    public static void main(String[] args) {
        try(DatagramChannel channel = DatagramChannel.open())
        {
                 channel.bind(new InetSocketAddress(PORT));
                 System.out.println("Server Listening on Port : "+PORT);
                 //to get the port Number
            Selector selector = Selector.open();
            // selector is a component that allows a single thread to monitor multiple channels for readiness to perform I/O operations. This is useful in non-blocking I/O scenarios.
            //then selector will allows the multiple channels by Selector.open()
            channel.configureBlocking(false);
//   channel.configureBlocking(false) ,In non-blocking mode, I/O operations (like reading from or writing to the channel) will not block the thread that initiated the operation.
// Instead, if the operation cannot be completed immediately (e.g., no data is available to read), it will return immediately without waiting.
            channel.register(selector, SelectionKey.OP_READ);
            //This constant indicates that the channel is interested in read operations i.e,SelectionKey.OP_READ
            ByteBuffer buffer = ByteBuffer.allocate(PORT_SIZE);
            while (true)
            {
                selector.select();
                var selectedKeys = selector.selectedKeys();
                Iterator<SelectionKey> keyIterator = selectedKeys.iterator();
                while (keyIterator.hasNext())
                {
                    SelectionKey key = keyIterator.next();
                    keyIterator.remove();
                    if(key.isReadable())
                    {
                        var registeredChannel = (DatagramChannel)key.channel();
                        buffer.clear();
                        var clientAddress = registeredChannel.receive(buffer);
                        buffer.flip();
                        byte[] data = new byte[buffer.remaining()];
                        buffer.get(data);
                        String audioFile = new String(data);
                        System.out.println("Client requested to Listen...."+audioFile);
                       new Thread(()->sendDataToClient(audioFile,clientAddress,registeredChannel)).start();
                    }
                }
            }
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    private static void sendDataToClient(String file,SocketAddress address,DatagramChannel channel)
    {
        ByteBuffer buffers = ByteBuffer.allocate(PORT_SIZE);
        try
        {
            FileChannel fileChannel = FileChannel.open(Paths.get(file), StandardOpenOption.READ);
            while(true){
                buffers.clear();
                int bytesRead = fileChannel.read(buffers);
                if(bytesRead == -1)
                {
                    break;
                }
                buffers.flip();
                while (buffers.hasRemaining())
                {
                    channel.send(buffers,address);
                }
                TimeUnit.MILLISECONDS.sleep(4);
            }

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
