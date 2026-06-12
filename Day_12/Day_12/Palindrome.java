import java.util.*;
public class Palindrome {
    public static boolean Palindrome(int n){
        int rev = 0, m;
        m=n;
        while(n != 0){
            int d = n%10;
            rev = rev*10 + d;
            n = n/10;
        }
        if( m == rev){
            return true;  // if Palindrome
        }
        else {
            return false;  // Number is not palindrome
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int n;
         boolean  ans;
         System.out.println("Enter any no.:");
         n = sc.nextInt();
         ans = Palindrome(n);
         System.out.println(ans);
    }

    
}
