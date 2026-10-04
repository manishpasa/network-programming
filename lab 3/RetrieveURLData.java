import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
public class RetrieveURLData {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String inputLine;
                int count = 0;
                while ((inputLine = in.readLine()) != null && count < 5) {
                    System.out.println(inputLine);
                    count++;    
                }
                System.out.println("Total lines read: " + count);
            }
            URLConnection connection = url.openConnection();
            System.out.println("Content Type: " + connection.getContentType());
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.example.com", 8080));
            URLConnection urlConnection = url.openConnection(proxy);
            System.out.println("Proxy Connection Content Type: " + urlConnection.getContentType());
            
            Object content = url.getContent();
            if (content != null) {
                System.out.println("content class: " + content.getClass().getName());
            } else {
                System.out.println("No content retrieved.");
            }
            Class<?>[] classes = {String.class, Byte.class};
            Object selectedContent = url.getContent(classes);
            if (selectedContent != null) {
                System.out.println("Selected content class: " + selectedContent.getClass().getName());
            } else {
                System.out.println("No selected content retrieved.");
            }
        } catch (MalformedURLException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}