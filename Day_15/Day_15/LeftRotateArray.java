import java.util.Arrays;

public class LeftRotateArray {
    // Function to rotate array left by k steps
    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle cases where k > n

        // Step 1: Copy first k elements
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Step 2: Shift remaining elements left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Step 3: Put temp elements at the end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // rotate left by 2 steps

        leftRotate(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}