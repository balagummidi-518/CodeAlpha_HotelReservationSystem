import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Room room1 = new Room(101);
        Room room2 = new Room(102);
        Room room3 = new Room(103);

        int choice;

        do {
            System.out.println("\n--- Hotel Reservation System ---");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nRoom Status:");
                    System.out.println("Room 101: " + (room1.booked ? "Booked" : "Available"));
                    System.out.println("Room 102: " + (room2.booked ? "Booked" : "Available"));
                    System.out.println("Room 103: " + (room3.booked ? "Booked" : "Available"));
                    break;

                case 2:
                    System.out.print("Enter room number to book: ");
                    int roomNo = sc.nextInt();

                    if (roomNo == 101)
                        room1.booked = true;
                    else if (roomNo == 102)
                        room2.booked = true;
                    else if (roomNo == 103)
                        room3.booked = true;
                    else {
                        System.out.println("Invalid Room Number!");
                        break;
                    }

                    System.out.println("Room booked successfully!");
                    break;

                case 3:
                    System.out.print("Enter room number to cancel booking: ");
                    int cancelRoom = sc.nextInt();

                    if (cancelRoom == 101)
                        room1.booked = false;
                    else if (cancelRoom == 102)
                        room2.booked = false;
                    else if (cancelRoom == 103)
                        room3.booked = false;
                    else {
                        System.out.println("Invalid Room Number!");
                        break;
                    }

                    System.out.println("Booking cancelled successfully!");
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}