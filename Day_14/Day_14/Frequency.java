import java.util.*;
public class Frequency{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n,x, i, c=0;
        
        System.out.println("Enter the size of an array:");
        n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements:");
        for(i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i] +" ");
        }
        System.out.println("Enter element whose frequency is to be known:");
        x = sc.nextInt();
        for(i = 0; i<n; i++){
            if(arr[i] == x){
                c++;
            }
        }
        System.out.println("Frequency=" +c);
    }
}