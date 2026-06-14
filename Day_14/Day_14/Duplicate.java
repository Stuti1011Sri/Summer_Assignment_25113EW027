import java.util.*;
public class Duplicate{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n,x, j,i;
        boolean found= false;
        System.out.println("Enter the size of an array:");
        n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements:");
        for(i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Duplicate elements are:");
        for(i=0; i<n; i++){
            for(j =i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
       
    }
}
