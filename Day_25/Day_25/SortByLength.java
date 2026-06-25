
import java.util.*;

public class SortByLength {
    public static void main(String[] args) {
        String[] words = {"Java", "Programming", "DSA", "Code"};

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println("Sorted by Length: " + Arrays.toString(words));
    }
}