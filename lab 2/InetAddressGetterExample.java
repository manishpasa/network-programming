import java.net.InetAddress;

public class InetAddressGetterExample {
public static void main(String[] args) {

try {
// Creating InetAddress object
InetAddress address = InetAddress.getByName("www.google.com");

// 1. getHostName()
System.out.println("Host Name: " + address.getHostName());

// 2. getHostAddress()
System.out.println("IP Address: " + address.getHostAddress());

// 3. getCanonicalHostName()
System.out.println("Canonical Host Name: "
+ address.getCanonicalHostName());

// 4. getAddress()
System.out.println("IP Address as Byte Array: "
+ java.util.Arrays.toString(address.getAddress()));

} catch (Exception e) {
System.out.println("Error: " + e);
}
}
}