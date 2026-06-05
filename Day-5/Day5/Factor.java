import java.util.*;
public class Factor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i, n, p;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for(i=1; i<=n; i++){
            p= n%i;
            if(p == 0){
                System.out.println(i);
            }
        }
    }
}