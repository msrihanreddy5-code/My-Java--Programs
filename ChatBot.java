import java.util.*;

class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine().toLowerCase();
        if(msg.contains("hi")) System.out.println("Hello!");
        else if(msg.contains("bye")) System.out.println("Goodbye!");
        else System.out.println("I am learning...");
    }
}
