import java.net.*;
public class ReachabilityExample {
public static void main(String[] args) {
try {
InetAddress address =
InetAddress.getByName("www.google.com");
boolean result =
address.isReachable(5000);
System.out.println("Host: "
+ address.getHostName());
System.out.println("Reachable: "
+ result);
} catch (Exception e) {
System.out.println(e);
}
}
}