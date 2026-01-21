import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            total += sc.nextInt();
        }

        double avg = total / (double) n;
        char grade;

        if (avg >= 90) grade = 'A';
        else if (avg >= 80) grade = 'B';
        else if (avg >= 70) grade = 'C';
        else if (avg >= 60) grade = 'D';
        else grade = 'F';

        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);
        System.out.println("Grade = " + grade);
    }
}
