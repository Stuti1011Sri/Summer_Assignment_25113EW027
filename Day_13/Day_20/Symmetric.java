import java.util.*;
public class Symmetric {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [][]A= {{2,4,7},
                    {5,7,9},
                    {2,6,8},
    };
        boolean issymmetric=true;
        int n =A.length;
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<n; j++){
              if(A[i][j] != A [j][i]){
                issymmetric= false;
                break;
              }
            if(issymmetric){
                System.out.println(" Not Symmetric");
            }
            else{
                System.out.println(" Not Symmetric");
        

            }
            }
            
        }
    }
}
