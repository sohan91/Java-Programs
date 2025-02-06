import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide
{
    private ServerSocket serverSocket;
    public ServerSide(ServerSocket serverSocket)
    {
        this.serverSocket = serverSocket;
    }
    public void startServer()
    {
        try
        {
            while (true)
            {
                if (!serverSocket.isClosed())
                //the server will waits untill the next client
                {
                   Socket socket = serverSocket.accept();
                   System.out.println("New Client has entered the into the chat!!");
                   ClientHandler clientHandler = new ClientHandler(socket);
                   //ClientHandler will extend the thread class or implements runnable interface
                    //The primary purpose of the ClientHandler class is to manage multiple client connections simultaneously.
                    Thread thread = new Thread(clientHandler);
                    thread.start();
                }
            }
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    //to close the ServerSocket
    public void closeServerSocket()
    {
        try
        {
            if(serverSocket!=null)
            {
                serverSocket.close();
            }
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) throws  IOException{

        ServerSocket serverSocket1 = new ServerSocket(1234);
        ServerSide server = new ServerSide(serverSocket1);
        server.startServer();
    }
}
