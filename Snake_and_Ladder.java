import java.util.*;

public class Snake_and_Ladder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random dice = new Random();

        System.out.println("Welcome to Snake and Ladder Game");
        System.out.print("Enter number of players: ");
        int numPlayers = sc.nextInt();
        sc.nextLine();

        String[] players = new String[numPlayers];
        int[] position = new int[numPlayers];

        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter name of player " + (i + 1) + ": ");
            players[i] = sc.nextLine();
            position[i] = 0;
        }

        HashMap<Integer, Integer> board = new HashMap<>();
        board.put(99, 54); 
        board.put(70, 55);
        board.put(52, 42);
        board.put(25, 2);

        board.put(6, 25);  
        board.put(11, 40);
        board.put(60, 85);
        board.put(46, 90);

        System.out.println("\n Game starts with players: " + Arrays.toString(players));

        boolean gameOver = false;

        while (!gameOver) {
            for (int i = 0; i < numPlayers; i++) {

                System.out.println("\n" + players[i] + "'s turn. Press Enter to roll dice");
                sc.nextLine();

                int roll = dice.nextInt(6) + 1;
                System.out.println(" Rolled: " + roll);

                position[i] += roll;

                if (position[i] > 100) {
                    position[i] -= roll;
                    System.out.println("Move exceeds 100. Stay at " + position[i]);
                }

                if (board.containsKey(position[i])) {
                    int newPos = board.get(position[i]);
                    if (newPos > position[i])
                        System.out.println("Ladder! Climb up to " + newPos);
                    else
                        System.out.println("Snake! Slide down to " + newPos);

                    position[i] = newPos;
                }

                System.out.println(players[i] + " is at position " + position[i]);

                if (position[i] == 100) {
                    System.out.println("\n" + players[i] + " WINS THE GAME! 🏆");
                    gameOver = true;
                    break;
                }
            }
        }

        sc.close();
    }
}
