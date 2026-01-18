import java.util.*;

class BankAccount {
    String name;
    int accNo;
    double balance;

    BankAccount(String n, int a, double b) {
        name = n; accNo = a; balance = b;
    }

    void deposit(double amt) { balance += amt; }
    void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
        else System.out.println("Insufficient balance");
    }

    void display() {
        System.out.println(name+" | "+accNo+" | Balance: "+balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("User",101,1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.display();
    }
}
