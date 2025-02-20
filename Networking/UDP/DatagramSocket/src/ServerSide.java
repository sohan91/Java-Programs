import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSide
{
    public static void main(String[] args) {

        try (ServerSocketChannel serverSocketChannel = ServerSocketChannel.open())
        {
            serverSocketChannel.socket().bind(new InetSocketAddress(5001));
            System.out.println("Server is listening on port: " + serverSocketChannel.socket().getLocalPort());

            while (true)
            {
                System.out.println("Waiting for client connection...");
                try (SocketChannel clientChannel = serverSocketChannel.accept())
                {
                    System.out.printf("Client %s connected\n", clientChannel.socket().getRemoteSocketAddress());
                    ByteBuffer buffer = ByteBuffer.allocate(1024);

                    int bytesRead = clientChannel.read(buffer);
                    while (bytesRead != -1)
                    {
                        buffer.flip();
                        clientChannel.write(ByteBuffer.wrap("Echo from the Server: ".getBytes()));
                        clientChannel.write(buffer);
                        buffer.clear();
                        bytesRead = clientChannel.read(buffer);
                    }
                }
                catch (IOException e)
                {
                    System.out.println("Client connection error: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
