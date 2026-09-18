import java.net.*;
import java.io.*;

class TCPClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);

            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

            pw.println("Hello Server!");

            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}