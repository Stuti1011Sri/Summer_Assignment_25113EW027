import java.util.*;
public class Armstrong_range{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int n, i,j, start, temp, end, d, sum=0;
        System.out.println("Enter start and end: ");
        start = sc.nextInt();
        end = sc.nextInt();
        for(i= start; i<= end;i++ ){
            j=i;
            sum = 0;
            temp = i;
            while(temp>0){
                d = temp%10;
                sum = sum+ (d*d*d);
                temp = temp/10;
            }
        if(sum == j){
            System.out.println(j);
            
            }
        }
    }
}