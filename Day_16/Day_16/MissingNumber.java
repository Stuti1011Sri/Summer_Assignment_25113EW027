import java.util.*;
public class MissingNumber {
    public static int findMissing(int[] arr, int n) {
        // Formula for sum of first n natural numbers
        int expectedSum = n * (n + 1) / 2;

        // Calculate actual sum of array elements
        int actualSum = 0;
        for (int i=0; i< arr.length; i++) {
            actualSum += arr[i];
        }

        // Missing number = expectedSum - actualSum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Example array
        int n = 6; // Array should contain numbers from 1 to 6

        System.out.println("Missing number: " + findMissing(arr, n));
    }
}