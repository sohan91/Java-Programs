import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUrlConnection {
    public static void main(String[] args) {

        URL url = null;
        try {
            url = new URL("http://example.com");
            print(url.openStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private static void print(InputStream stream)
    {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(stream));
            String read;
            while ((read = buffer.readLine()) != null)
            {
                   System.out.println(read);
            }
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
