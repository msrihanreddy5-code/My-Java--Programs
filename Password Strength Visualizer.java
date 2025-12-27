import java.util.Scanner;

public class PasswordStrengthVisualizer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pwd = sc.nextLine();

        int score = 0;

        if (pwd.length() >= 8) score++;
        if (pwd.matches(".*[A-Z].*")) score++;
        if (pwd.matches(".*[a-z].*")) score++;
        if (pwd.matches(".*[0-9].*")) score++;
        if (pwd.matches(".*[@#$%!^&*].*")) score++;

        System.out.print("Strength: [");
        for (int i = 0; i < score; i++) System.out.print("█");
        for (int i = score; i < 5; i++) System.out.print("-");
        System.out.print("] ");

        switch (score) {
            case 5 -> System.out.println("Very Strong 🔐");
            case 4 -> System.out.println("Strong");
            case 3 -> System.out.println("Medium");
            default -> System.out.println("Weak ⚠️");
        }

        sc.close();
    }
}
