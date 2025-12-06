import java.util.*;

public class PasswordGen {
    public static void main(String[] args) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%";
        Random r = new Random();
        String pass = "";

        for (int i = 0; i < 10; i++)
            pass += chars.charAt(r.nextInt(chars.length()));

        System.out.println("Generated Password: " + pass);
    }
}
