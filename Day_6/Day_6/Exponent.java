import java.util.*;
public class Exponent{
    public static int Exponential(int base, int power){
        int ans = 1;
        for (int i= 1; i<=power; i++){
             ans *= base;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int base, power, result;
        System.out.println("Enter base and power: ");
        base = sc.nextInt();
        power = sc.nextInt();
        result = Exponential(base, power);
        System.out.println(result);
    }
}