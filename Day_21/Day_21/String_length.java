import java.util.*;
public class String_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a word:");
        str = sc.next();
        int c=0;
        for(char ch : str.toCharArray()){
           c++; 
        }
        System.out.println(c); 
    }
}
