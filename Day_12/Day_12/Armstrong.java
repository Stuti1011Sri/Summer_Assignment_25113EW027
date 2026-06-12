import java.util.*;
public class Armstrong{
    public static boolean Armstrong(int n){
        int sum=0, m=n;
        while(n != 0){
            int d = n%10;
            sum = sum + d*d*d;
            n = n/10;
        }
        if(sum == m){
            return true;   // if Armstrong
        }
        else{
            return false;   // if not Armstrong
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        boolean ans;
        System.out.println("Enter a number:");
        n = sc.nextInt();
        ans = Armstrong(n);
        System.out.println(ans);

    }
}