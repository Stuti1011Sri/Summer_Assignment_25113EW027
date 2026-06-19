import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] diff = new int[rows][cols];

        System.out.println("Enter elements of Matrix A:");
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                B[i][j] = sc.nextInt();

        // Subtraction
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                diff[i][j] = A[i][j] - B[i][j];

        System.out.println("Resultant Matrix after Subtraction:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++)
                System.out.print(diff[i][j] + " ");
            System.out.println();
        }
    }
}