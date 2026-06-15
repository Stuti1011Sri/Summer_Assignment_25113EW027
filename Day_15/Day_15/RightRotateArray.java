import java.util.Arrays;

public class RightRotateArray {
    static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle k > n

        // Step 1: Copy last k elements
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        // Step 2: Shift remaining elements right
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // Step 3: Put temp elements at the front
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // rotate right by 2 steps

        rightRotate(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}