import java.net.*;
public class MulticastServer {
public static void main(String[] args)
throws Exception {
MulticastSocket socket = new MulticastSocket();
InetAddress group =InetAddress.getByName("239.1.1.1");
String message = "Hello Multicast";
byte[] data =message.getBytes();
DatagramPacket packet =new DatagramPacket(data,data.length, group, 5000);
socket.send(packet);
System.out.println("Message sent to multicast group.");
socket.close();
}
}
