import java.util.*;
public class Recursive_Sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, ans=0;
        System.out.println(" Enter any number: ");
        n = sc.nextInt();
        for(int i = 0; i<=n; i++){
            
            ans = Sum(i);
        }
            System.out.println( +ans);
        

    }
    public static int Sum(int n){
        if(n == 0){
            return 0;
        }
        
        else{
            return n + Sum(n-1);
        }
    }
}
