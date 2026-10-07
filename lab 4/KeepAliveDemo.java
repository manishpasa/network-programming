public class KeepAliveDemo {
public static void main(String[] args) {
System.setProperty("http.keepAlive", "true");
System.setProperty("http.maxConnections", "5");
System.out.println("HTTP Keep-Alive configured.");
}}