import java.util.*;
public class Maximum{
    public static int Maximum(int a, int b ){
        int result;
        if(a>b){
            result = a;
        }
        else{
            result= b;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ans, a, b;
        System.out.println("Enter a and b:");
        a = sc.nextInt();
        b = sc.nextInt();
        ans = Maximum(a,b);
        System.out.println(ans);
    }
}