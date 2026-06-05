import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i, n, c=0;
        System.out.println("Enter any no.:");
        n = sc.nextInt();
        for(i=1; i<=n; i++){
            if(n%i == 0){
                c++;
            }
        }
        if(c<=2){
            System.out.println("PRIME");
        }
        else{
            System.out.println("NOT PRIME");
        }
        
    }
    
}
