import java.util.*;
public  class Even_Odd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, even=0, odd=0,i;
        System.out.println("Enter size:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2 ==0){
                even += 1;
            }
            else{
                odd  += 1;
            }
        }
    
    System.out.println("Even elements are: " +even);
    System.out.println("Even elements are: " +odd);
    }
}