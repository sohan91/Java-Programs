import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable
{

    public static ArrayList<ClientHandler> clientHandlers = new ArrayList<>();
    private static Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String clientUserName;

    public ClientHandler(Socket socket)  {
        try {
            this.socket = socket;
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.clientUserName = bufferedReader.readLine();
            // used to read and store the username of the client who just connected. Here’s a detailed breakdown of its purpose:
            clientHandlers.add(this);
            broadcastMeassage("SERVER : " + clientUserName + " has entered the chat!!");
        }catch (IOException e)
        {
            closeEveryThing(socket,bufferedReader,bufferedWriter);
        }
    }
    @Override
    public void run() {
        String messageFromClient;
        while (socket.isConnected()) {
            try {
                messageFromClient = bufferedReader.readLine();
                broadcastMeassage(messageFromClient);
            } catch (IOException e) {
                closeEveryThing(socket, bufferedReader, bufferedWriter);
                break;
            }
        }
    }

    public void broadcastMeassage(String messageToSend)
    {
        for(ClientHandler clientHandler : clientHandlers)
        {
            try {
                if(!clientHandler.clientUserName.equals(clientUserName));
                clientHandler.bufferedWriter.write(messageToSend);
                clientHandler.bufferedWriter.newLine();
                clientHandler.bufferedWriter.flush();
                }catch (IOException e)
            {
                closeEveryThing(socket, bufferedReader, bufferedWriter);
            }
        }
    }

    public void removeClientHandler()
    {
        clientHandlers.remove(this);
        broadcastMeassage("SERVER : "+clientUserName+" has left the chat!!");
    }

    public void closeEveryThing(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter)
    {
        removeClientHandler();
        try {
            if(bufferedReader!=null)
            {
                bufferedReader.close();
            }
            if(bufferedWriter != null)
            {
                bufferedWriter.close();
            }
            if(socket!=null)
            {
                socket.close();
            }

        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }


}