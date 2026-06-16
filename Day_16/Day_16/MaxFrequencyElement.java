import java.util.*;
public class MaxFrequencyElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 2, 3, 5};

        int maxFreq = 0;
        int maxElement = arr[0];

        // Outer loop → pick each element
        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            // Inner loop → count frequency of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Update max frequency element
            if (count > maxFreq) {
                maxFreq = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Element with maximum frequency: " + maxElement);
        System.out.println("Frequency: " + maxFreq);
    }
}