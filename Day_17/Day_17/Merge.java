import java.util.*;
public class Merge{
    public static int[] Merge(int arr[], int temp[]){
        int[] ans = new int[arr.length + temp.length];
        for(int i=0; i<arr.length; i++){
            ans[i] = arr[i];
        }
        for(int j=0; j< temp.length; j++){
                ans[arr.length +j] = temp[j];
        }
        
    return ans;
        
    }
    public static void main(String args[]){
        int[] arr = {1,2,3, 4};
        int [] temp = {5,6,7,8,9};
        int[] merged = Merge(arr, temp);
         System.out.println("Merge array is="+Arrays.toString(merged));

    }
}