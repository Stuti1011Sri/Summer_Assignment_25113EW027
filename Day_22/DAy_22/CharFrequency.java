import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int[] freq = new int[256]; // ASCII size

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;  // increment count for this character
        }

        // Display frequencies
        System.out.println("Character frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }
}