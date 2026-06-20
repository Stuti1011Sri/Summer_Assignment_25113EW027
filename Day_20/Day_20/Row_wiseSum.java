import java.util.*;
public class Row_wiseSum {
    public static void main(String[] args) {
        int[][] A = {
            {2, 4, 7},
            {5, 7, 9},
            {2, 6, 8}
        };

        int rows = A.length;
        int cols = A[0].length;

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += A[i][j];  // add elements of row i
            }
            System.out.println("Sum of row " + (i+1) + " = " + sum);
        }
    }
}