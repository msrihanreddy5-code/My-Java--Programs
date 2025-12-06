import java.util.*;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add  2. Remove  3. View  4. Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter task: ");
                tasks.add(sc.nextLine());
            } else if (ch == 2) {
                System.out.print("Enter task number: ");
                tasks.remove(sc.nextInt() - 1);
            } else if (ch == 3) {
                System.out.println("Your Tasks:");
                for (int i = 0; i < tasks.size(); i++)
                    System.out.println((i+1) + ". " + tasks.get(i));
            } else break;
        }
    }
}
