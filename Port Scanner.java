import java.net.*;

public class PortScanner {
    public static void main(String[] args) {
        String host = "localhost";

        for (int port = 1; port <= 1000; port++) {
            try {
                Socket s = new Socket();
                s.connect(new InetSocketAddress(host, port), 50);
                System.out.println("Open: " + port);
                s.close();
            } catch (Exception e) {}
        }
    }
}
