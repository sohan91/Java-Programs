import java.io.*;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URL;

import static java.net.HttpURLConnection.HTTP_OK;

public class HttpClient {
    public static void main(String[] args) {
        try {
           // URL url = new URL("http://example.com");
            URL url = new URL("http://localhost:8080");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent","Chrome");
            connection.setRequestProperty("Accept","application/json, text/html");
            connection.setReadTimeout(3000);
            int responseCode = connection.getResponseCode();
            System.out.printf("Response Code is : %d\n",responseCode);
            if(responseCode != HTTP_OK)
            {
                System.out.println("Error Reading Web Pages "+url);
            return;
            }
            printData(connection.getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
    public static void printData(InputStream stream)
    {
        try {
        BufferedReader input = new BufferedReader(new InputStreamReader(stream));
        String reader;
        while((reader = input.readLine())!=null)
        {
            System.out.println(reader);
        }
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
