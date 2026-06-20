
public class ColumnWiseSum {
    public static void main(String[] args) {
        int[][] A = {
            {2, 4, 7},
            {5, 7, 9},
            {2, 6, 8}
        };

        int rows = A.length;
        int cols = A[0].length;

        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += A[i][j];  // add elements of column j
            }
            System.out.println("Sum of column " + (j+1) + " = " + sum);
        }
    }
}