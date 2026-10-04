import java.net.MalformedURLException;
import java.net.URL;
public class SplitURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com:8080/index.html?query=example#section");
            System.out.println("URL: " + url);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Default Port: " + url.getDefaultPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("File: " + url.getFile());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Ref: " + url.getRef());
            System.out.println("Authority: " + url.getAuthority());
        } catch (MalformedURLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}