import java.util.*;
public class Decimal{
    public static int  BinarytoDecimal(String binary){
        int decimal = 0, power = 0;
        for(int i = binary.length()-1 ; i>=0; i--){
            int bit = binary.charAt(i) - '0';
            decimal += bit*(Math.pow(2, power));
            power++;
        }
        return decimal;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String binary;
        System.out.println("Enter the string:");
        binary = sc.next();
         int decimal = BinarytoDecimal(binary);
        System.out.println(decimal);
    }
}