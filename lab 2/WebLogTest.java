import java.io.*;
import java.net.*;
public class WebLogTest {
public static void main(String[] args) {
String file = "logfile.txt";
try (
FileInputStream fin = new FileInputStream(file);
Reader in = new InputStreamReader(fin);
BufferedReader bin = new BufferedReader(in)
) {
String entry;
while ((entry = bin.readLine()) != null) {
// Extract IP address
int index = entry.indexOf(' ');
String ip = entry.substring(0, index);
// Extract remaining information
String theRest = entry.substring(index);
try {
// Find hostname using DNS
InetAddress address =
InetAddress.getByName(ip);
System.out.println(
address.getHostName() + theRest
);
} catch (UnknownHostException ex) {
System.err.println(entry);
}
}
} catch (IOException ex) {
System.out.println("Exception: " + ex);
}
}
}