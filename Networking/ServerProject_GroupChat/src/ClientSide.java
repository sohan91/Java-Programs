import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientSide
{
    private static Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String userName;

    public ClientSide(Socket socket,String userName)
    {
        try {
            this.socket = socket;
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.userName = userName;
        }catch (IOException e)
        {
            closeEveryThing(socket,bufferedReader,bufferedWriter);
        }
    }

    public void sendMessage()
    {
        try
        {
            bufferedWriter.write(userName);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            Scanner scanner = new Scanner(System.in);
            while(socket.isConnected())
            {
                String messageToSend = scanner.nextLine();
                bufferedWriter.write(userName+ " : "+messageToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }catch (IOException e)
        {
            closeEveryThing(socket,bufferedReader,bufferedWriter);
        }
    }

    public void listenForMessage()
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                     String messageFromGroupChat;
                     while (socket.isConnected())
                     {
                         try {
                             messageFromGroupChat = bufferedReader.readLine();
                             System.out.println(messageFromGroupChat);
                         }catch (IOException e)
                         {
                             closeEveryThing(socket,bufferedReader,bufferedWriter);
                         }
                     }
            }
        }).start();
    }
    public void closeEveryThing(Socket socket, BufferedReader bufferedReader,BufferedWriter bufferedWriter)
    {
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

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a user name for the group chat : ");
        String userName = scanner.nextLine();
        Socket socket = new Socket("localhost",1234);
        ClientSide clientSide = new ClientSide(socket,userName);
        clientSide.listenForMessage();
        clientSide.sendMessage();
    }

}