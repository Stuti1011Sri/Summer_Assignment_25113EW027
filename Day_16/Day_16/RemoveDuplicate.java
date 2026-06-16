import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 4, 9, 7};

        Arrays.sort(arr);  // Sort array first

        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length - 1]; // Add last element

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}