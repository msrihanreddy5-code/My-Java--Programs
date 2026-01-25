import java.util.*;

public class ArraySort {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int q = sc.nextInt();
        while(q-- > 0) {
            int x = sc.nextInt();
            int idx = Arrays.binarySearch(a, x);

            System.out.println(idx < 0 ? -1 : idx + 1);
        }
        sc.close();
    }
}
