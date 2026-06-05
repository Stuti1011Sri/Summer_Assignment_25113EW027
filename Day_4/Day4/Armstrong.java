import java.util.*;
public class Armstrong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, d, m, sum=0;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        m = n;
        while(n>0){
            d = n%10;
            sum = sum+ (d*d*d);
            n = n/10;
        }
        if(sum == m)
            System.out.println("Armstrong number");
        else
            System.out.println("Not a Armstrong number");
    }
}