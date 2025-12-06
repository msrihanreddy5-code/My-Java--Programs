import java.io.*;

public class FileExplorer {
    public static void main(String[] args) {
        File f = new File("C:/");

        File[] files = f.listFiles();
        for (File x : files)
            System.out.println((x.isDirectory() ? "[DIR] " : "[FILE] ") + x.getName());
    }
}
