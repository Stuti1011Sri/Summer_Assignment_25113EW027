import java.util.*;
public class Array_4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c=0 ,i,n;
        System.out.println("Enter size of the array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in thr array");
        for(i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
        // Move zeros to the end
        int index = 0; // position for non-zero elements
        for ( i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i]; // place non-zero at front
            }
        }

        // Fill remaining positions with zeros
        while (index < n) {
            arr[index++] = 0;
        }

        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
    }
}