import java.security.SecureRandom;

public class PasswordGen {
    public static void main(String[] args) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%";
        SecureRandom r = new SecureRandom();
        StringBuilder pass = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            pass.append(chars.charAt(r.nextInt(chars.length())));
        }

        System.out.println("Generated Password: " + pass);
    }
}
