import java.net.*;
public class InetAddressFactoryExample {
public static void main(String[] args) {
try {
// 1. Get local host
InetAddress local =
InetAddress.getLocalHost();
System.out.println("Local Host: " + local);
// 2. Get address of a named host
InetAddress named =
InetAddress.getByName("www.google.com");
System.out.println("Named Host: " + named);
// 3. Get all addresses of a host
InetAddress[] all =
InetAddress.getAllByName("www.google.com");
for (InetAddress address : all) {
System.out.println("All Addresses: " + address);
}
// 4. Create address from IP bytes
byte[] ip = {127, 0, 0, 1};
InetAddress address =
InetAddress.getByAddress(ip);
System.out.println("IP Address: " + address);
} catch (Exception e) {
System.out.println(e);
}
}
}