
//To,Support for the multiple client we use MutliThreading and give some feature
package dev.lpa.server;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost",6000))
        {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
            Scanner sc = new Scanner(System.in);
            String requestString;
            String responseString;
            do {
               System.out.print("Enter a message to display in Server : ");
               requestString = sc.nextLine();
               output.println(requestString);
               if(!requestString.equalsIgnoreCase("exit"))
               {
                  responseString =  input.readLine();
                   System.out.println(responseString);
               }
            }while (!requestString.equalsIgnoreCase("exit"));
        }catch (IOException e)
        {
            System.out.println("Connection failed,"+e.getMessage());
        }
        finally{
            System.out.println("Disconnected from the Server.....");
        }
    }
}
