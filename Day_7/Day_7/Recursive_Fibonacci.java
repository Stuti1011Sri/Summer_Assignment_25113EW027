import java.util.*;
public class Recursive_Fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, ans;
        System.out.println(" Enter any number: ");
        n = sc.nextInt();
        for(int i = 0; i<=n; i++){
        
            ans = Fibonacci(i);
            System.out.println( +ans);
        }

    }
    public static int Fibonacci(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1 ){
            return 1;
        }
        else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
}
