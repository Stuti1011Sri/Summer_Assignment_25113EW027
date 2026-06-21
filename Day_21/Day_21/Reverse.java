import java.util.*;
public class Reverse{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a word:");
        str = sc.next();
        String rev ="";
        
        for(int i= str.length()-1; i>=0; i--){
            rev = rev +str.charAt(i);
        }
    System.out.println(rev);
            
    }
}



