import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("java", "A powerful programming language");
        map.put("python", "Dynamic scripting language");

        Scanner sc = new Scanner(System.in);
        System.out.print("Word: ");
        String w = sc.nextLine();

        System.out.println(map.getOrDefault(w, "Not found!"));
    }
}
