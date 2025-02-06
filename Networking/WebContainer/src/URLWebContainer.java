import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLWebContainer {
    public static void main(String[] args) {
        try {
//            URL url = new URL("http://example.com");
            URL url = new URL("https://jsonplaceholder.typicode.com/todos?id=5");
            URLConnection urlConnection = url.openConnection();
            System.out.println(urlConnection.getContentType());
            urlConnection.getHeaderFields().entrySet().forEach(System.out :: println);
            System.out.println(urlConnection.getHeaderField("Cache-Control"));
            webContainer(urlConnection.getInputStream());
//            webContainer(url.openStream());
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    private static void webContainer(InputStream stream)
    {
             try
             {
                 BufferedReader inputstream = new BufferedReader(new InputStreamReader(stream));
                 String line;
                 while ((line = inputstream.readLine())!=null)
                 {
                     System.out.println(line);
                 }
             }catch (IOException e)
             {
                 System.out.println(e.getMessage());
             }
    }
}
