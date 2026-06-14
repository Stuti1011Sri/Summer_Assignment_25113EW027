import java.util.*;
public class Second_Largest{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n,i;
        boolean found= false;
        System.out.println("Enter the size of an array:");
        n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements:");
        for(i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i] +" ");
        }
          
        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for ( i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;   // update second largest
                largest = arr[i];          // update largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];    // update second largest
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements are equal).");
        } 
        else {
            System.out.println("Second largest element is: " + secondLargest);
        }
        
    }
}