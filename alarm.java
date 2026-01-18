import java.util.Scanner;
public class alarm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time in hours and minutes (HH MM): ");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        // Subtract 45 minutes
        minutes -= 45;
        if (minutes < 0) {
            minutes += 60;
            hours -= 1;
            if (hours < 0) {
                hours = 23;
            }
        }

        System.out.printf("Alarm set for: %02d:%02d\n", hours, minutes);
        scanner.close();
    }
}
