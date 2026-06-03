import java.util.*;
public class LCM{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1, num2, temp, x, y, lcm;
        System.out.println("Enter num1 and num2 :");
        x = sc.nextInt();
        y= sc.nextInt();
        num1=x;
        num2=y;
        while(num2 != 0){
            temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
        int gcd = num1;
        // LCM * GCD = num1 * num2
        lcm = (x*y)/ gcd;
        System.out.println(lcm);
    }

}