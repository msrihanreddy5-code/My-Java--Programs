import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        // Calculations
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Output with superscripts and formatted numbers
        System.out.printf("The circumference is: %.2f cm\n", circumference);
        System.out.printf("The area is: %.2f cm²\n", area);  // superscript 2
        System.out.printf("The volume is: %.2f cm³\n", volume); // superscript 3

        scanner.close();
    }
}
