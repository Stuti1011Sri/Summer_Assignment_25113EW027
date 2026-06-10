import java.util.*;
public class Alphabet_Pyramid{
   public static void main(String args[]) {
        int i, j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5-i; j++){
                  System.out.print("  ");
                }
            for(j= 0; j<i; j++){
                  System.out.print((char)(65+j) +" ");
                }
            for(j=i-2; j>=0; j--){
                  System.out.print((char)(65+j )+" ");
                }
        System.out.println();
        }
    
   }
}
