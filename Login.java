import java.io.*;

class Login {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("users.txt");
        fw.write("admin 1234");
        fw.close();
        System.out.println("User stored");
    }
}
