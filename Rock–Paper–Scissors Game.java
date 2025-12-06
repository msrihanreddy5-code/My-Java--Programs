import java.util.*;

public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"rock", "paper", "scissors"};
        Random r = new Random();

        System.out.print("Your choice: ");
        String user = sc.next().toLowerCase();

        String comp = arr[r.nextInt(3)];
        System.out.println("Computer: " + comp);

        if (user.equals(comp))
            System.out.println("Draw!");
        else if (user.equals("rock") && comp.equals("scissors")
              || user.equals("paper") && comp.equals("rock")
              || user.equals("scissors") && comp.equals("paper"))
            System.out.println("You win!");
        else
            System.out.println("You lose!");
    }
}
