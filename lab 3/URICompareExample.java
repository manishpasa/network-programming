import java.net.URI;

public class URICompareExample {
    public static void main(String[] args) {
        try {
            URI uri1 = new URI("http://www.example.com/index.html?query=example#section");
            URI uri2 = new URI("http://www.example.com/index.html?query=example#section2");
            
            int result = uri1.compareTo(uri2);
            if (result == 0) {
                System.out.println("URI 1 is equal to URI 2");
            } else if (result < 0) {
                System.out.println("URI 1 comes before URI 2");
            } else {
                System.out.println("URI 1 comes after  URI 2");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}