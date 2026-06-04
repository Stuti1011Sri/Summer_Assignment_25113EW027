
import java.util.*;
public class Fibonacci{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n, a=0, b=1, i, temp=0;
       System.out.print("Enter n: ");
       n = sc.nextInt();
       for(i=0; i<= n; i++){
       System.out.println(a);
       
       temp= a+b;
        a = b;
        b= temp;
       }

   }

}

