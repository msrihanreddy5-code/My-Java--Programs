import java.util.Scanner;

public class CollegeSimulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cgpa = 7;
        int health = 70;
        int stress = 30;

        for (int day = 1; day <= 3; day++) {
            System.out.println("\nDay " + day);
            System.out.println("1. Study");
            System.out.println("2. Sleep");
            System.out.println("3. Party");

            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> { cgpa++; stress += 10; }
                case 2 -> { health += 10; stress -= 5; }
                case 3 -> { health -= 10; stress += 15; }
            }
        }

        System.out.println("\nFinal Stats:");
        System.out.println("CGPA: " + cgpa);
        System.out.println("Health: " + health);
        System.out.println("Stress: " + stress);

        if (cgpa >= 8 && health >= 60)
            System.out.println("🎉 Successful College Life!");
        else
            System.out.println("⚠️ Need Better Balance!");

        sc.close();
    }
}
