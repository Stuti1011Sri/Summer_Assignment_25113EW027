
import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String result = "";

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If character is not a space, add it to result
            if (ch != ' ') {
                result = result + ch;
            }
        }

        System.out.println("String without spaces: " + result);
    }
}