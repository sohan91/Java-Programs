import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class AboutHttpURLContent {
    public static void main(String[] args)  {
        URL url = null;
        try {
            url = new URL("https://www.youtube.com/watch?v=HNYA6bqL6bU");

            InputStream inputStream = url.openConnection().getInputStream();
            int i;
            while ((i = inputStream.read())!=-1)
            {
                System.out.print((char)i);
            }
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("-".repeat(70));
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            for(int i = 0;i<8;i++)
            {
                System.out.println(connection.getHeaderFieldKey(i)+ " = "+connection.getHeaderField(i));
            }


         connection.disconnect();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
