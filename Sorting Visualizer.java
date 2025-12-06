public class BubbleSortVisualizer {
    public static void main(String[] args) throws Exception {
        int[] a = {5, 1, 4, 2, 8};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }

                for (int x : a) System.out.print(x + " ");
                System.out.println();
                Thread.sleep(500);
            }
        }
    }
}
