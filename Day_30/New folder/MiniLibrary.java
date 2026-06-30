
import java.util.Scanner;

class Book {
    String title;
    String author;
    boolean isAvailable;
}

public class MiniLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[3];

        // Initialize books
        books[0] = new Book(); books[0].title="Java Basics"; books[0].author="James"; books[0].isAvailable=true;
        books[1] = new Book(); books[1].title="DSA Guide"; books[1].author="Mark"; books[1].isAvailable=true;
        books[2] = new Book(); books[2].title="Python Intro"; books[2].author="Guido"; books[2].isAvailable=true;

        System.out.println("Enter book title to borrow: ");
        String search = sc.nextLine();

        boolean found = false;
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(search) && b.isAvailable) {
                b.isAvailable = false;
                System.out.println("You borrowed: " + b.title);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Book not available!");
    }
}