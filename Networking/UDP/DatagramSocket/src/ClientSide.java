import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSide
{
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5001);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in))
        {
            String requestString;
            String responseString;

            do {
                System.out.print("Enter string to be echoed (sent to server): ");
                requestString = scanner.nextLine();

                printWriter.println(requestString);
                if (!requestString.equals("exit")) {
                    responseString = bufferedReader.readLine();
                    System.out.println(responseString);
                }
            } while (!requestString.equals("exit"));
        }
        catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
