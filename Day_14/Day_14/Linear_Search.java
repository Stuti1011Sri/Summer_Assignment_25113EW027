import java.util.*;
public class Linear_Search{
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
        System.out.print("Enter element to find:");
        x = sc.nextInt();
        for(i=1; i<n; i++){
            if(arr[i] == x){
                found = true;
                break;
             
            }
            
        }
        if(found){
             System.out.println("Element found at:" +i);
        }
        else{
            System.out.println("Element not found");
        
        }
    }
}

   