import java.util.*;
public class FirstRepeating {
    public static void main(String[] args) {
        String str = "MicrosoftAdobePaytm";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                System.out.println("First repeating character: " + c);
                return;
            }
        }
        System.out.println("No repeating character found.");
    }
}