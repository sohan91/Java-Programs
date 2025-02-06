import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.http.HttpRequest;

import static java.net.HttpURLConnection.HTTP_OK;

public class HttpServerSide {
   private  static int visitorCount = 0;
    public static void main(String[] args) {
        try {
            System.err.println("I am waiting for the Client Connection");
            HttpServer server = HttpServer.create(new InetSocketAddress(8080),0);
            server.createContext("/",exchange -> {
//The first argument specifies the path for the context (in this case, "/" means it will handle requests to the root of the server).
//This line establishes a context for the root path. Any HTTP requests sent to the server's root URL (e.g., http://localhost:8080/)
// will be processed by the provided lambda function.
                String requestMethod = exchange.getRequestMethod();
               // is used to retrieve the HTTP request method (such as GET, POST, PUT, DELETE, etc.) from the current request being handled by the server
               System.out.println("Request Method : "+requestMethod);
                if (requestMethod.equalsIgnoreCase("POST"))
                {

                    visitorCount++;
                }
               String query =
                       """
                               <html>
                               <body>
                               <h1>This is my Server Side Application Using java</h1>
                               <p>The number of Visitor signed are %d</p>
                               <form method = "post">
                               <input type = "submit" value = "Submit">
                               </form>
                               </body>
                               </html>
                               
                             """.formatted(visitorCount);

               var bytes = query.getBytes();
               exchange.sendResponseHeaders(HTTP_OK,bytes.length);
               exchange.getResponseBody().write(bytes);
               exchange.close();
               
            });
            server.start();
            System.out.println("Server is Listening on Port 8080...");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
