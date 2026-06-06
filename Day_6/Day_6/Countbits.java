import java.util.*;
public class Countbits{
    public static int CountSetBits(int n){
        int count = 0;
        while(n>0){
            count += n & 1; //chekc last bit
            n >>= 1; // right shift
        }
        return count;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n, result ;
        System.out.println("Enter a number: ");
        n =  sc.nextInt();
        result = CountSetBits(n);
        System.out.println("Set bits =" +result);
    }
}