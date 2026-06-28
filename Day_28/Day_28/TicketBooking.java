
import java.util.*;

class Ticket {
    int ticketId;
    String passengerName;
    String destination;

    Ticket(int ticketId, String passengerName, String destination) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.destination = destination;
    }

    void display() {
        System.out.println("Ticket ID: " + ticketId + ", Passenger: " + passengerName + ", Destination: " + destination);
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Ticket> tickets = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Ticket Booking ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Ticket ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Destination: ");
                    String dest = sc.nextLine();
                    tickets.add(new Ticket(id, name, dest));
                    System.out.println("Ticket booked successfully!");
                    break;
                case 2:
                    for (Ticket t : tickets) t.display();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}