import java.util.*;
public class Large_Small{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("Enter size of an array:");
        n = sc.nextInt();
        int arr[] = new int[n];        
        System.out.println("Enter elements:");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(i=1; i<n; i++){
             if(arr[i]> max){
               max = arr[i];  
             }
        }
        int min =  arr[0];
        for(i=1; i<n; i++){
             if(arr[i]< min){
                min =arr[i];
                 
             }
        }
        System.out.println("Largest element is:" +max);
        System.out.println("Smallest element is:" +min);
    }
}