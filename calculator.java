import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- SIMPLE CALCULATOR -----");
            System.out.print("Enter first number (or type exit): ");
            String input1 = sc.next();

            if (input1.equalsIgnoreCase("exit")) {
                System.out.println("Calculator closed. Goodbye!");
                break;
            }

            double num1 = Double.parseDouble(input1);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Choose operation (+, -, *, /): ");
            String op = sc.next();

            double result = 0;

            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                        continue;
                    }
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("Invalid operator! Use + - * /");
                    continue;
            }

            System.out.println("Result: " + result);
            System.out.println("Type 'exit' anytime to stop.\n");
        }

        sc.close();
    }
}
