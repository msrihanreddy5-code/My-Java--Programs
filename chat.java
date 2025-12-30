import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Java Chat App");
        System.out.print("Enter User 1 name: ");
        String user1 = sc.nextLine();

        System.out.print("Enter User 2 name: ");
        String user2 = sc.nextLine();

        System.out.println("\nType 'exit' to stop chatting\n");

        while (true) {
            System.out.print(user1 + ": ");
            String msg1 = sc.nextLine();
            if (msg1.equalsIgnoreCase("exit")) break;

            System.out.print(user2 + ": ");
            String msg2 = sc.nextLine();
            if (msg2.equalsIgnoreCase("exit")) break;
        }

        System.out.println("Chat ended.");
        sc.close();
    }
}
