import java.util.*;
public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("Enter size of array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+ " ");
        }
    }
    
}
