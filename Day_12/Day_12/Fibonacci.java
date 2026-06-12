import java.util.*;
public class Fibonacci{
    public static void Fibonacci(int n){
        int a=0, b=1, temp = 0;
        System.out.println(a);
        System.out.println(b);
        for(int i=2; i<=n; i++){
            temp = a+b;
            System.out.println(temp);
            a=b;
            b =temp;
        } 
          
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n:");
        n = sc.nextInt();
        System.out.println("Fibonacci series till" + n +"is");
        Fibonacci(n);
    }
}