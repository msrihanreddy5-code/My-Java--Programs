import java.util.Scanner;

public class Main {

    public static double readPositiveDouble(Scanner scanner, String prompt) {
        double value = -1;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value > 0) {
                    break; 
                } else {
                    System.out.println(" Please enter a number greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); 
            }
        }
        return value;
    }

    public static int readPositiveInt(Scanner scanner, String prompt) {
        int value = -1;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= 0) {
                    break;
                } else {
                    System.out.println(" Please enter 0 or a positive number.");
                }
            } else {
                System.out.println(" Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = readPositiveDouble(scanner, "Enter the length of side A: ");
        double b = readPositiveDouble(scanner, "Enter the length of side B: ");

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        int decimals = readPositiveInt(scanner, "Enter how many decimal places you want (0 for none): ");

        scanner.nextLine();

        System.out.print("Enter the unit (e.g., cm, m, inches): ");
        String unit = scanner.nextLine();

        if (decimals == 0) {
            System.out.printf(" The hypotenuse (side c) is: %.0f %s%n", c, unit);
        } else {
            String format = "%." + decimals + "f %s%n";
            System.out.printf(" The hypotenuse (side c) is: " + format, c, unit);
        }

        scanner.close();
    }
}
