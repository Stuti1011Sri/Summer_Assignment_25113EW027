
import java.util.*;
public class Sum_Avg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, i, sum =0, avg;
        System.out.println("Enter size of array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            
        }
            avg = sum/n;
            
        System.out.println(" Sum is =" +sum);
        System.out.println(" Average is =" +avg);
        
    }
    
}
