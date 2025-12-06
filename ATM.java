import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        while (true) {
            System.out.println("1.Withdraw 2.Deposit 3.Check Balance 4.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Amount: ");
                int a = sc.nextInt();
                if (a <= balance) balance -= a;
                else System.out.println("Insufficient balance!");
            } 
            else if (ch == 2) {
                System.out.print("Amount: ");
                balance += sc.nextInt();
            } 
            else if (ch == 3) {
                System.out.println("Balance = " + balance);
            } 
            else break;
        }
    }
}
