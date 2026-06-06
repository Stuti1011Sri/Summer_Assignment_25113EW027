
import java.util.*;
public class Binary {
    public static String decimaltobinary(int n){
    int rem;
    String binary = "";
    while(n>0){
        rem = n%2;
        binary= rem + binary;
        n = n/2;
    }
    return binary;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter  a number:");
        n = sc.nextInt();
        String result = decimaltobinary(n);
        System.out.println (result);
    }
    

}
