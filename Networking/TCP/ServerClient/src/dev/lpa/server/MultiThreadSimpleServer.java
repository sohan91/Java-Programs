package dev.lpa.server;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadSimpleServer
{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        try {
        ServerSocket serverSocket = new ServerSocket(6000);
            System.out.println("Wating for the client connection........");
        while(true) {

                Socket socket = serverSocket.accept();
            System.out.println("Server accepts the Client Request...");
                socket.setSoTimeout(700_000);

                executorService.submit(()->clientHandler(socket));

                }
            }catch (IOException  e) {
            System.out.println(e.getMessage());
        }
    }

    public static void clientHandler(Socket socket) {

            try {
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
                while (true) {
                    String echo = input.readLine();
                    System.out.println("Client entered data is " + echo);
                    if (echo.equalsIgnoreCase("exit")) {
                        System.out.println("Disconnected from the client....");
                        break;
                    }
                    output.println("Echo from the Server : " + echo);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

    }
}