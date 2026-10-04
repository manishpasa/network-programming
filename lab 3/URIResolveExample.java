import java.net.URI;
public class URIResolveExample {
    public static void main(String[] args) {
        try {
            URI baseURI = new URI("http://www.example.com/base/");
            URI relativeURI = new URI("subdir/resource.html");
            URI resolvedURI = baseURI.resolve(relativeURI);
            System.out.println("Base URI: " + baseURI);
            System.out.println("Relative URI: " + relativeURI);
            System.out.println("Resolved URI: " + resolvedURI);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
