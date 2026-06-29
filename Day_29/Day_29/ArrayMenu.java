import java.util.Scanner;

public class ArrayMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int choice;
        do {
            System.out.println("\n--- Array Operations ---");
            System.out.println("1. Display Array");
            System.out.println("2. Find Maximum");
            System.out.println("3. Find Minimum");
            System.out.println("4. Search Element");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int x : arr) System.out.print(x + " ");
                    System.out.println();
                    break;
                case 2:
                    int max = arr[0];
                    for (int x : arr) if (x > max) max = x;
                    System.out.println("Maximum = " + max);
                    break;
                case 3:
                    int min = arr[0];
                    for (int x : arr) if (x < min) min = x;
                    System.out.println("Minimum = " + min);
                    break;
                case 4:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;
                    for (int x : arr) if (x == key) found = true;
                    System.out.println(found ? "Found!" : "Not Found!");
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}