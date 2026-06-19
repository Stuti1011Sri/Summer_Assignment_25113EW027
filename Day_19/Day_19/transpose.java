
import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] transpose = new int[cols][rows];

        System.out.println("Enter elements of Matrix:");
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                A[i][j] = sc.nextInt();

        // Transpose
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                transpose[j][i] = A[i][j];

        System.out.println("Transpose of Matrix:");
        for(int i=0; i<cols; i++) {
            for(int j=0; j<rows; j++)
                System.out.print(transpose[i][j] + " ");
            System.out.println();
        }
    }
}