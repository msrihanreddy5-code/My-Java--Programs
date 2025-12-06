import java.util.*;

public class GuessGame {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        int guess = 0;

        while (guess != num) {
            System.out.print("Guess number (1–100): ");
            guess = sc.nextInt();

            if (guess < num) System.out.println("Too low!");
            else if (guess > num) System.out.println("Too high!");
            else System.out.println("Correct!");
        }
    }
}
