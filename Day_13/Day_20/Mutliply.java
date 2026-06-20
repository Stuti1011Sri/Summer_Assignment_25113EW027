import java.util.*;
public class Mutliply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = {{2,3} , {4,5}};
        int[][] B = {{6,7}, {8,9}};
        int rowA = A.length;
        int colA = A[0].length;
        int colB = B[0].length;
        int[][]C = new int[rowA][colB];
        for(int i = 0; i< rowA; i++){
            for(int j = 0; j<colB; j++){
                for(int k=0; k<colA; k++){
                 C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for(int i = 0; i< rowA; i++){
            for(int j = 0; j<colB; j++){
                System.out.print (C[i][j] + " ");
            }
        }
    }

    
}
