import java.util.*;
public class Strong{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int i, f=1, m, d, sum=0,n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        m = n;
        while(n>0){
            d = n%10;
            f = 1;   
            for( i=1; i<=d; i++){
                f = f*i;
            }
            sum = sum + f;
            n = n/10;

        }
        
        if(sum == m){
            System.out.println("Strong number");
        }
        else
            System.out.println("Not a Strong no.");
    }
}