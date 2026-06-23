import java.util.*;
public class MaxOccurringChar {
    public static void main(String[] args) {
        String str = "MicrosoftAdobePaytm";
        int[] freq = new int[256]; // ASCII size
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        int max = -1;
        char result = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                result = c;
            }
        }
        System.out.println("Maximum occurring character: " + result);
    }
}