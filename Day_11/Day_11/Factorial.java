import java.util.*;
public class Factorial{
    public static int Fact(int n){
        int f =1;
        for(int i= 1; i<=n; i++){
             f *= i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, ans;
        System.out.println("Enter any number: ");
        n = sc.nextInt();
        ans = Fact(n);
        System.out.println(ans);
    }
}