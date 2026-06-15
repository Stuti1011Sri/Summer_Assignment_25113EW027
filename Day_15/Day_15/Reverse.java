import java.util.*;
public class Reverse{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n,x, i;
        boolean found= false;
        System.out.println("Enter the size of an array:");
        n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements:");
        for(i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i] +" ");
        }
        System.out.println("Reverse elements are:");
        for(i=n-1 ; i>=0; i--){
             System.err.print(arr[i] + " ");
        }
    }
}
