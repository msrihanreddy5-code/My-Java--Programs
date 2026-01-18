import java.util.*;

class RankSystem {
    public static void main(String[] args) {
        int[] marks = {85,92,78,90};
        Arrays.sort(marks);
        for(int i=marks.length-1;i>=0;i--)
            System.out.println(marks[i]);
    }
}
