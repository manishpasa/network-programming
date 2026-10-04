import java.net.MalformedURLException;
import java.net.URL;
public class FourWayOfCreatingURL {
    public static void main(String[] args) {
        try {
            URL url1 = new URL("http://www.example.com");
            System.out.println("URL 1: " + url1);
            
            URL url2 = new URL("http", "www.example.com", "/index.html");
            System.out.println("URL 2: " + url2);
            
            URL url3 = new URL(url1, "/about.html");
            System.out.println("URL 3: " + url3);
            
            URL url4 = new URL("http://www.example.com:8080/index.html");
            System.out.println("URL 4: " + url4);
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
    }
}