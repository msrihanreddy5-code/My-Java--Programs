import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        String[] q = {"Capital of India?", "2 + 2 = ?"};
        String[][] opt = {{"Delhi", "Mumbai", "Chennai"}, {"3", "4", "5"}};
        int[] ans = {1, 2};

        Scanner sc = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < q.length; i++) {
            System.out.println(q[i]);
            for (int j = 0; j < 3; j++)
                System.out.println((j+1) + ". " + opt[i][j]);

            System.out.print("Answer: ");
            if (sc.nextInt() == ans[i]) score++;
        }

        System.out.println("Score = " + score);
    }
}
