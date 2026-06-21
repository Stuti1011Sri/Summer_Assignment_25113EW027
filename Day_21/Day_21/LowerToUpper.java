import java.util.*;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String upper = str.toUpperCase();  // direct conversion
        System.out.println("Uppercase: " + upper);
        sc.close();
    }
}