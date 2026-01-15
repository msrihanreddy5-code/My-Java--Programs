import java.util.Scanner;
import java.util.Random;

public class ludo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number of players (2-4): ");
        int numPlayers = scanner.nextInt();

        if (numPlayers < 2 || numPlayers > 4) {
            System.out.println("Invalid number of players. Please restart and enter 2 to 4 players.");
            scanner.close();
            return;
        }

        System.out.println("\nStarting Ludo game with " + numPlayers + " players!");
        System.out.println("First player to reach position 30 wins.\n");

        int[] positions = new int[numPlayers];

        boolean gameOver = false;
        int currentPlayer = 0;

        while (!gameOver) {

            System.out.println("Player " + (currentPlayer + 1) + "'s turn");
            System.out.print("Press 1 to roll the dice: ");
            int choice = scanner.nextInt();

            if (choice != 1) {
                System.out.println("Invalid input. Turn skipped.\n");
            } else {
                int dice = random.nextInt(6) + 1;
                System.out.println("Dice rolled: " + dice);

                positions[currentPlayer] += dice;

                if (positions[currentPlayer] > 30) {
                    positions[currentPlayer] = 30;
                }

                System.out.println("Player " + (currentPlayer + 1) +
                        " position: " + positions[currentPlayer]);

                if (positions[currentPlayer] == 30) {
                    System.out.println("\n🎉 Player " + (currentPlayer + 1) + " WINS THE GAME! 🎉");
                    gameOver = true;
                    break;
                }
            }

            System.out.println();

            currentPlayer = (currentPlayer + 1) % numPlayers;
        }

        scanner.close();
    }
}
