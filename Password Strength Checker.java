import java.util.regex.*;

public class PasswordChecker {
    public static void main(String[] args) {
        String pass = "Abcd1234@";

        boolean strong = pass.length() >= 8 &&
                         pass.matches(".*[A-Z].*") &&
                         pass.matches(".*[a-z].*") &&
                         pass.matches(".*\\d.*") &&
                         pass.matches(".*[@#$%].*");

        System.out.println(strong ? "Strong Password" : "Weak Password");
    }
}
