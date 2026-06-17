import java.util.*;
public class Intersection {
    public static void main(String args[]){
        int[] arr_1 = {1,2,3,4,5};
        int[] arr_2 = { 5, 6, 7,4 };
        for(int i =0; i<arr_1.length; i++){
            for(int j =0; j<arr_2.length; j++){
                if(arr_1[i] == arr_2[j]){
                    System.out.print(arr_1[i] +" ");
                    break;
                }
            }
        }
    }
}
