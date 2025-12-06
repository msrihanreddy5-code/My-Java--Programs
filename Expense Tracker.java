import java.util.*;

public class ExpenseTracker {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add Expense 2.View 3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Category: ");
                String c = sc.nextLine();
                System.out.print("Amount: ");
                int a = sc.nextInt();
                map.put(c, map.getOrDefault(c, 0) + a);
            } 
            else if (ch == 2) {
                for (String k : map.keySet())
                    System.out.println(k + ": " + map.get(k));
            } 
            else break;
        }
    }
}
