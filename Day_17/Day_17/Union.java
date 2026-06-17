import java.util.*;
public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        // Assume elements are in range 0–100
        boolean[] present = new boolean[101];

        // Mark elements of arr1
        for (int num : arr1) {
            present[num] = true;
        }

        // Mark elements of arr2
        for (int num : arr2) {
            present[num] = true;
        }

        // Print union
        System.out.print("Union of arrays: ");
        for (int i = 0; i < present.length; i++) {
            if (present[i]) {
                System.out.print(i + " ");
            }
        }
    }
    
}
