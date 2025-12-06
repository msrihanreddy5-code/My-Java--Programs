import java.net.*;

public class URLChecker {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.google.com");
            HttpURLConnection h = (HttpURLConnection) u.openConnection();
            h.setRequestMethod("GET");
            int code = h.getResponseCode();

            System.out.println("Status Code: " + code);
        } catch (Exception e) {
            System.out.println("Invalid URL!");
        }
    }
}
