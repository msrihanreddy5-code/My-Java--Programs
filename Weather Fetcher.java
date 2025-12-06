import java.io.*;
import java.net.*;
import java.util.*;

public class WeatherApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter city name: ");
        String city = sc.nextLine();

        try {
            // Public free API (no key needed)
            String api = "https://wttr.in/" + city + "?format=%C+%t";

            URL url = new URL(api);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream())
            );

            String result = br.readLine();
            System.out.println("Weather in " + city + ": " + result);

        } catch (Exception e) {
            System.out.println("Unable to fetch weather. Check internet or city name.");
        }
    }
}
