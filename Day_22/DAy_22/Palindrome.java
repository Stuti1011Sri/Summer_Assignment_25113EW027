import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a word:");
        str = sc.next();
        String rev ="";

        for(int i= str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Plaindrome");
        }
    }

    
}
