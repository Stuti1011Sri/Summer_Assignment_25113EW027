import java.util.*;
public class Recursive_Reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, ans=0;
        System.out.println(" Enter any number: ");
        n = sc.nextInt();
        
            ans = Reverse(n , 0);
        
            System.out.println( +ans);
        

    }
    public static int Reverse(int n, int rev){
        if(n == 0){
               return rev;
        }
        else{
            int d = n%10;
            rev = rev*10+d;
            return Reverse(n/10, rev);
        }
    }
}
 