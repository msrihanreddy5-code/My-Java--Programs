import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int i, String n) {
        id = i;
        name = n;
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add 2.Delete 3.Show 4.Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                list.add(new Employee(id, sc.nextLine()));
            } 
            else if (ch == 2) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                list.removeIf(e -> e.id == id);
            } 
            else if (ch == 3) {
                for (Employee e : list)
                    System.out.println(e.id + " - " + e.name);
            } 
            else break;
        }
    }
}
