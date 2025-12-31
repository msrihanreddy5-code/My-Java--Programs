import java.util.Scanner;
import java.math.BigInteger;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
        }
        else if (n <= 5000) {
            BigInteger fact = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println("Factorial = " + fact);
        }
        else {
            System.out.println("Number too large to display factorial.");
            System.out.println("Digits in " + n + "! = " + digitsInFactorial(n));
            System.out.println("Trailing zeros in " + n + "! = " + trailingZeros(n));
        }
        sc.close();
    }

    static int trailingZeros(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }

    static int digitsInFactorial(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.log10(i);
        }
        return (int) sum + 1;
    }
}
