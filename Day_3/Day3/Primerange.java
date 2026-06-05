import java.util.*;
public class Primerange{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n, i, num;
        System.out.println("Enter n:");
        n =  sc.nextInt();
        
        for(num=2; num<=n; num++){
            boolean isPrime = true;
            
            for(i=2; i<=num/2 ; i++){
                if(num%i == 0){
                    isPrime = false;
                    break;
                }
            }
        
            if(isPrime){
            System.out.print(num+" ");
            }
        }
    }
}   
