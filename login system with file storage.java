import java.io.*;
import java.util.*;

public class LoginSystem {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        String u = sc.nextLine();

        System.out.print("Password: ");
        String p = sc.nextLine();

        FileWriter fw = new FileWriter("users.txt", true);
        fw.write(u + ":" + p + "\n");
        fw.close();

        System.out.println("User registered!");
    }
}
