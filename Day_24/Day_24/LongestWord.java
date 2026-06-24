import java.util.*;

public class LongestWord {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" "); // split by spaces
        String longest = "";
        
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String sentence = "I love programming in Java language";
        System.out.println("Longest word: " + findLongestWord(sentence));
    }
}