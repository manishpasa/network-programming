import java.net.*;
public class MulticastClient {
public static void main(String[] args) throws Exception {
// Create multicast socket
MulticastSocket socket = new MulticastSocket(5000);
// Get multicast group address
InetAddress group = InetAddress.getByName("239.1.1.1");
// Join multicast group
socket.joinGroup(group);
// Create buffer
byte[] buffer = new byte[1024];
// Create packet
DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
// Receive data
socket.receive(packet);
// Convert data into String
String message =new String(packet.getData(),0,packet.getLength());
System.out.println("Received: " + message);
// Leave group
socket.leaveGroup(group);
// Close socket
socket.close();
}
}