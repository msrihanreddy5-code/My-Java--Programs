public class SnakeGame {
    public static void main(String[] args) throws Exception {
        int x = 5;

        while (true) {
            System.out.print("\r");
            for (int i = 0; i < x; i++) System.out.print(" ");
            System.out.print("O");

            x++;
            if (x == 50) x = 5;

            Thread.sleep(100);
        }
    }
}
