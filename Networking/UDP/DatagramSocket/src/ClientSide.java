import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class ClientSide
{
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",5000);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
        Scanner scanner = new Scanner(System.in);
        String requestString;
        String responseString;

        do {
            System.out.println("Enter string to be echoed (sent to server): ");
            requestString = scanner.nextLine();

           printWriter.println(requestString);
            if (!requestString.equals("exit")) {
                responseString = bufferedReader.readLine();
                System.out.println(responseString);
            }
        } while(!requestString.equals("exit"));
    }
}