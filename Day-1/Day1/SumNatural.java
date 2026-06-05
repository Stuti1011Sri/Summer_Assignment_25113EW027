import java.util.*;
public class SumNatural{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i, sum=0, n;
        System.out.println("Enter value of n:");
        n = sc.nextInt();
        for(i=1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println("Sum = " +sum);
    }    
}