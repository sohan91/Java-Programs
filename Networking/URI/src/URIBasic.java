import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class URIBasic {
    public static void main(String[] args) throws MalformedURLException {
        URI u = URI.create("https://www.youtube.com/watch?v=HNYA6bqL6bU");
        printURI(u);
URL url = u.toURL();
System.out.println("-".repeat(50));
printURL(url);
System.out.println("-".repeat(50)+"\n"+"URL is "+url);
    }
    private static void printURI(URI uri)
    {
        System.out.printf("""
              --------------------------------------------------------------
              [schema :]schema-specific-part[#fragment]
              --------------------------------------------------------------
              Schema : %s
              Scheme-specific part : %s
              Authority : %s
              User-Info : %s
                   Host : %s
                   Port : %d
                   Path : %s
                  Query : %s
                Fragmet : %s
        
                """,uri.getScheme(),
                uri.getSchemeSpecificPart(),
                uri.getAuthority(),
                uri.getUserInfo(),
                uri.getHost(),
                uri.getPort(),
                uri.getPath(),
                uri.getQuery(),
                uri.getFragment());
    }
    private static void printURL(URL url)
    {
        System.out.printf("""
              --------------------------------------------------------------
              [schema :]schema-specific-part[#fragment]
              --------------------------------------------------------------
              Authority : %s
              User-Info : %s
                   Host : %s
                   Port : %d
                   Path : %s
                  Query : %s
                """,
                url.getAuthority(),
                url.getUserInfo(),
                url.getHost(),
                url.getPort(),
                url.getPath(),
                url.getQuery());
    }
}
