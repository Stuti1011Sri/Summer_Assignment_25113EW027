import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, d, rev=0, m=0;
        System.out.println("Enter any no.:");
        n = sc.nextInt();
        m=n;
        while(n>0){
            d= n%10;
            rev = rev*10+d;
            n = n/10;
        }
            if(m == rev){
                System.out.println("PALINDROME");
            }
            else{
                System.out.println("NOT PALINDROME");
            }
    }
}
