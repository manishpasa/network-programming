import java.net.*;
class InetAddressFactoryExample {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Local Host Address: " + local);
            InetAddress named = InetAddress.getByName("www.example.com");
            System.out.println("Named Host Address: " + named);
            InetAddress[] all = InetAddress.getAllByName("www.example.com");
            for (InetAddress addr : all) {
                System.out.println("All Addresses: " + addr);
            }byte[] ip = {127, 0, 0, 1};
            InetAddress loopback = InetAddress.getByAddress(ip);
            System.out.println("Loopback Address: " + loopback);
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }
}