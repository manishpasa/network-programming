import java.net.*;
public class SpamCheckIp {
public static boolean isSpam(String ipAddress) {
// Blacklist domain
String blacklistDomain =
"sbl.spamhaus.org";
// Reverse the IP address
String reversedIpAddress =
new StringBuilder(ipAddress)
.reverse()

.toString();
// Create the DNS query
String query =
reversedIpAddress + "."
+ blacklistDomain;
try {
// Perform DNS lookup
InetAddress address =
InetAddress.getByName(query);
// Check blacklist result
return address.getHostAddress()
.equals("127.0.0.2");
} catch (UnknownHostException ex) {
// DNS lookup failed
return false;
}
}
public static void main(String[] args) {
String ipAddress = "192.0.2.1";
boolean isSpam = isSpam(ipAddress);
System.out.println(
"Is spam? " + isSpam);
}
}