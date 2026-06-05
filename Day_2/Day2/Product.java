import java.util.*;
public class Product{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, p=1, d;
        System.out.println("Enter any no.:");
        n = sc.nextInt();
        while(n!=0){
            d = n%10;
            p = d*p;
            n = n/10;
        }
        System.out.println(p);
    }
}