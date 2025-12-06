import java.util.*;

public class TicTacToe {
    static char[] board = {' ','1','2','3','4','5','6','7','8','9'};

    static void show() {
        System.out.println(board[1]+"|"+board[2]+"|"+board[3]);
        System.out.println("-+-+-");
        System.out.println(board[4]+"|"+board[5]+"|"+board[6]);
        System.out.println("-+-+-");
        System.out.println(board[7]+"|"+board[8]+"|"+board[9]);
    }

    static boolean win() {
        int[][] w = {{1,2,3},{4,5,6},{7,8,9},{1,4,7},{2,5,8},{3,6,9},{1,5,9},{3,5,7}};
        for (int[] a : w)
            if (board[a[0]] == board[a[1]] && board[a[1]] == board[a[2]])
                return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char turn = 'X';
        int moves = 0;

        while (true) {
            show();
            System.out.print("Player " + turn + " choose (1-9): ");
            int pos = sc.nextInt();

            if (board[pos] == 'X' || board[pos] == 'O') continue;

            board[pos] = turn;
            moves++;

            if (win()) { show(); System.out.println(turn + " wins!"); break; }
            if (moves == 9) { show(); System.out.println("Draw!"); break; }

            turn = (turn == 'X') ? 'O' : 'X';
        }
    }
}
