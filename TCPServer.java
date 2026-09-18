import java.net.*;
import java.io.*;

class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);

            System.out.println("Server is waiting...");

            Socket s = ss.accept();

            BufferedReader br = new BufferedReader(
                new InputStreamReader(s.getInputStream())
            );

            String message = br.readLine();

            System.out.println("Message from Client: " + message);

            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}