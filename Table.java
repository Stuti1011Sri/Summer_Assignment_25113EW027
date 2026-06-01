import java.util.*;
public class Table{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n, i, p=1;
        System.out.print("Enter n:");
        n = sc.nextInt();
        for(i=1; i<=10; i++ ){
            p = n*i; 
            System.out.println(n+ "x" + i+ "="  +p);
        }
    }
}