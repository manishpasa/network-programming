import java.net.*;

class inet6AdressExample { 
    public static void main(String[] args) { 
        try { 
            Inet6Address address = (Inet6Address) Inet6Address.getByName("2001:db8::1"); 
            
            System.out.println("IPv6 Address: " + address.getHostAddress()); 
            System.out.println("Host Name: " + address.getHostName()); 
        } catch (UnknownHostException e) { 
            System.out.println(e); 
        } 
    } 
}
