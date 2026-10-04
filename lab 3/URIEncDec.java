import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URIEncDec {
    public static void main(String[] args) {
        try {
            String originalString = "Hello World! This is a test string with special characters: @#$%^&*()";
            // Encoding the string
            String encodedString = URLEncoder.encode(originalString, StandardCharsets.UTF_8.toString());
            System.out.println("Encoded String: " + encodedString);
            
            // Decoding the string
            String decodedString = URLDecoder.decode(encodedString, StandardCharsets.UTF_8.toString());
            System.out.println("Decoded String: " + decodedString);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}