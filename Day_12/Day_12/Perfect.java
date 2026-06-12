import java.util.*;
public class Perfect{
    public static boolean Perfect(int n){
        int m=n, sum =0;
        for(int i = 1; i<n; i++){
            if(n%i == 0){
                sum += i;
            }
        }
            if(sum == m){
                 return true;  // Perfect number
            }
            else{
                 return false;   // if no. is not perfect
            }
    
    }
    public static void main(String args[]){
        Scanner sc = new    Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n = sc.nextInt();
        System.out.println(Perfect(n));
    }
}