import java.io.*;

public class FileStats {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));

        int lines = 0, words = 0, chars = 0;
        String s;

        while ((s = br.readLine()) != null) {
            lines++;
            chars += s.length();
            words += s.split(" ").length;
        }

        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);
    }
}
