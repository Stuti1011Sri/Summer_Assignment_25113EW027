import java.util.*;
public class Largest_prime_factor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i, n, largeprime = -1;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
       while(n%2 == 0){
        largeprime = 2;
        n /= 2;
       }
       for(i = 3; i*i <= n; i += 2){
        while(n%i == 0){
            largeprime = i;
            n /= i;
        }
       }
       if(n>2){
        largeprime = n;
       }
       System.out.println("Largest prime factor is:" +largeprime);

    }
}