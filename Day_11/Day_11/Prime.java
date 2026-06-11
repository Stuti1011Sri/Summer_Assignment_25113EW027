import java.util.*;

public class Prime {
    public static String Prime(int n) {
        int c = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }

        if (c == 2) {
            return "Prime";
        } else {
            return "Not prime";
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        String ans;

        System.out.println("Enter any number:");
        n = sc.nextInt();

        ans = Prime(n);
        System.out.println(ans);
    }
}