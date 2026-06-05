import java.util.*;
public class Digit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, c=0;
        System.out.print("Enter n:");
        n = sc.nextInt();
        while(n>0){
            n = n/10;
            c++;
        }
        System.out.print( c);
            
    }
}