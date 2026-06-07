import java.util.*;
public class Recursive_Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, ans;
        System.out.println(" Enter any number: ");
        n = sc.nextInt();
        ans = Factorial(n);
        System.out.println("Factorial: " +ans);
    }
    public static int Factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n*Factorial(n-1);
        }
    }
}
