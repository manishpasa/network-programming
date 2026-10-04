import java.net.URI;

public class URIStringExample {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.example.com/index.html?query=example#section");
            URI uri2 = new URI("http://www.example.com/index.html?query=example#section2");
            //string representation of the URI
            System.out.println("URI 1: " + uri.toString());
            //Ascii representation of the URI
            System.out.println("URI 2: " + uri2.toASCIIString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
