import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSide
{
    public static void main(String[] args) {

        try
        {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
           serverSocketChannel.socket().bind(new InetSocketAddress(5000));
           System.out.println("Server is Listining on the Port : "+serverSocketChannel.socket().getLocalPort());

           while (true)
           {
               System.out.println("Wating to connect the another client request.!");
               SocketChannel clientChannel = serverSocketChannel.accept();
               System.out.printf("Client is %s Connected\n",clientChannel.socket().getRemoteSocketAddress());
               ByteBuffer buffer = ByteBuffer.allocate(1024);
               SocketChannel channel = clientChannel;
               System.out.println("Wating to the client requested data..");
               int byteReader = channel.read(buffer);
               if(byteReader>0)
               {
                   buffer.flip();
                   channel.write(ByteBuffer.wrap("Echo from the Server : ".getBytes()));
                   while (buffer.hasRemaining())
                   {
                       channel.write(buffer);
                   }
                   buffer.clear();
               } else if (byteReader == -1) {
                   System.out.printf("Connection to %s lost \n ",channel.socket().getRemoteSocketAddress());
                   channel.close();
               }
           }

        }catch (IOException e)
        {
            System.out.println("Runtime Error :"+e.getMessage());
        }
    }
}