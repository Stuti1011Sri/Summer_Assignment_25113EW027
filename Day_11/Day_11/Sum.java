import java.util.*;
public class Sum {
    public static int Sum(int a, int b ){
        
        int result = a+b;
    
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ans, a,b;
        System.out.println("Enter two number:");
        a = sc.nextInt();
        b = sc.nextInt();
        ans = Sum(a,b);
        System.out.println(ans);
    }
}
