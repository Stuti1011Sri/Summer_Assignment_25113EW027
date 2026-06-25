
import java.util.*;

public class CommonCharacters {
    public static void main(String[] args) {
        String s1 = "microsoft";
        String s2 = "adobe";
        String s3 = "paytm";

        Set<Character> set1 = new HashSet<>();
        for (char c : s1.toCharArray()) set1.add(c);

        Set<Character> set2 = new HashSet<>();
        for (char c : s2.toCharArray()) set2.add(c);

        Set<Character> set3 = new HashSet<>();
        for (char c : s3.toCharArray()) set3.add(c);

        set1.retainAll(set2);
        set1.retainAll(set3);

        System.out.println("Common Characters: " + set1);
    }
}