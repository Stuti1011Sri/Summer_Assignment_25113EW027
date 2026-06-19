import java.util.Scanner;

public class Diagona_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] A = new int[n][n];
        int primarySum = 0, secondarySum = 0;

        System.out.println("Enter elements of Matrix:");
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                A[i][j] = sc.nextInt();

        // Diagonal sums
        for(int i=0; i<n; i++) {
            primarySum += A[i][i];           // Primary diagonal
            secondarySum += A[i][n-i-1];     // Secondary diagonal
        }

        System.out.println("Primary Diagonal Sum = " + primarySum);
        System.out.println("Secondary Diagonal Sum = " + secondarySum);
    }
}