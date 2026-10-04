import java.net.URI;
public class ConstructingURI {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.example.com/index.html?query=example#section");
            System.out.println("URI: " + uri);
            System.out.println("Scheme: " + uri.getScheme());
            System.out.println("Authority: " + uri.getAuthority());
            System.out.println("User Info: " + uri.getUserInfo());
            System.out.println("Port: " + uri.getPort());
            System.out.println("Host: " + uri.getHost());
            System.out.println("Path: " + uri.getPath());
            System.out.println("Query: " + uri.getQuery());
            System.out.println("Fragment: " + uri.getFragment());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}