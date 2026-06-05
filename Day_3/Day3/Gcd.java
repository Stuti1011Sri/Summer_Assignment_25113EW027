import java.util.*;
public class Gcd{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int num1, num2, temp= 0;
       System.out.print("Enter num1 and num2: ");
       num1 = sc.nextInt();
       num2 = sc.nextInt();
       while(num2 != 0){
        temp = num2;
        num2 = num1%num2;
        num1 = temp;
       }
    System.out.println(temp);
    }
}


   