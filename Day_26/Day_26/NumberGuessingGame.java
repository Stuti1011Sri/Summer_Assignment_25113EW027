import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random() * 100) + 1; // random number 1-100
        int guess = 0;

        System.out.println("Guess the number between 1 and 100:");

        while (guess != number) {
            guess = sc.nextInt();
            if (guess < number) {
                System.out.println("Too low, try again!");
            } else if (guess > number) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Congratulations! You guessed it right.");
            }
        }
    }
}