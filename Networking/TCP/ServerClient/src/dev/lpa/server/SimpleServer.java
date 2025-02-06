package dev.lpa.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(6000))//the port maximum value is 0-65535
        {
           try (Socket socket = serverSocket.accept())
           {
               System.out.println("Server accepts client connection");
               BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
               //Read the chunks of data
               PrintWriter output = new PrintWriter(socket.getOutputStream(), true);//print thr chunks of data
               while (true)
               {
                   String echoString = input.readLine();
                   System.out.println("Server got requested from the client : "+echoString);
                   if(echoString.equalsIgnoreCase("exit"))
                   {
                       break;
                   }
                 output.println("Echo from the Server : "+echoString);
               }
           }
        }catch (IOException e)
        {
            System.out.println("Exception in Server i.e.,"+e.getMessage());
        }
    }
}
