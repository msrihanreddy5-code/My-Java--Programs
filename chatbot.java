import java.util.*;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("You: ");
            String msg = sc.nextLine().toLowerCase();

            if (msg.contains("hello")) System.out.println("Bot: Hi!");
            else if (msg.contains("how are you")) System.out.println("Bot: I'm fine.");
            else if (msg.contains("bye")) { System.out.println("Bot: Goodbye!"); break; }
            else System.out.println("Bot: Sorry, I don't understand.");
        }
    }
}
