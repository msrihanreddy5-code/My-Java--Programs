import java.util.*;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();

        double f = (c * 9/5) + 32;

        System.out.println("Fahrenheit: " + f);
    }
}
