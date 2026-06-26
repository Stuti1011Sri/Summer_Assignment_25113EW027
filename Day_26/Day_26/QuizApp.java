
import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to Quiz!");
        
        System.out.println("Q1: What is the capital of India?");
        System.out.println("1. Mumbai  2. Delhi  3. Kolkata  4. Chennai");
        int ans1 = sc.nextInt();
        if (ans1 == 2) score++;

        System.out.println("Q2: Who is known as Father of Nation?");
        System.out.println("1. Nehru  2. Gandhi  3. Bose  4. Patel");
        int ans2 = sc.nextInt();
        if (ans2 == 2) score++;

        System.out.println("Q3: Which language is platform independent?");
        System.out.println("1. C  2. C++  3. Java  4. Python");
        int ans3 = sc.nextInt();
        if (ans3 == 3) score++;

        System.out.println("Your final score: " + score + "/3");
    }
}