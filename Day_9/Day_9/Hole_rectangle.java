import java.util.*;
public class Hole_rectangle{
    public static void main(String args[]){
        int i, j;
        for(i = 1; i<=4; i++){
            for(j = 1; j<=6; j++){
                if(j==1  || i==1 || i== 4 || j==6){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}