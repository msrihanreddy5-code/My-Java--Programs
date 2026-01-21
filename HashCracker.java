import java.security.*;

public class HashCracker {
    public static void main(String[] args) throws Exception {
        String target = md5("abc");

        for (char a='a'; a<='z'; a++)
            for (char b='a'; b<='z'; b++)
                for (char c='a'; c<='z'; c++) {
                    String test = "" + a + b + c;
                    if (md5(test).equals(target)) {
                        System.out.println("Cracked: " + test);
                        return;
                    }
                }
    }

    static String md5(String s) throws Exception {
        MessageDigest m = MessageDigest.getInstance("MD5");
        byte[] b = m.digest(s.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte x : b) sb.append(String.format("%02x", x));
        return sb.toString();
    }
}
