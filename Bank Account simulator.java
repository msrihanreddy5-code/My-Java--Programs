class Bank {
    private double balance = 0;

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) {
        if (amt > balance) System.out.println("Insufficient balance!");
        else {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        }
    }

    void show() {
        System.out.println("Balance = " + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(5000);
        b.withdraw(1200);
        b.show();
    }
}
