import java.net.*;
public class Inet6AddressExample {
public static void main(String[] args) {
try {
Inet6Address ip =
(Inet6Address) Inet6Address.getByName(
"2001:db8::1"
);
System.out.println("Host Name: "
+ ip.getHostName());
System.out.println("IPv6 Address: "
+ ip.getHostAddress());
} catch (Exception e) {
System.out.println(e);
}
}
}