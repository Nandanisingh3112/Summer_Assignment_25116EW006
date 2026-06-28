import java.util.Scanner;
//TICKET BOOKING SYSTEM

public class Question3 {
    private static final int ROWS = 5;
    private static final int COLS = 6;
    private static final double TICKET_PRICE = 12.50;
    private static final char AVAILABLE = 'O';
    private static final char BOOKED = 'X';
    
    private final char[][] seatingChart;

    // Constructor initializes all system seats to available
    public Question3() {
        seatingChart = new char[ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                seatingChart[i][j] = AVAILABLE;
            }
        }
    }

    // Prints the formatted seating chart grid to console
    public void displaySeats() {
        System.out.println("\n--- Seating Arrangement ---");
        System.out.print("   ");
        for (int col = 1; col <= COLS; col++) {
            System.out.print(col + " ");
             }
        System.out.println();

        for (int i = 0; i < ROWS; i++) {
            char rowLabel = (char) ('A' + i);
            System.out.print(rowLabel + "  ");
            for (int j = 0; j < COLS; j++) {
                System.out.print(seatingChart[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("('O' = Available, 'X' = Booked)");
    }

    // Evaluates input criteria and flags targeted seat as booked
    public void bookSeat(String seatRef) {
        if (seatRef == null || seatRef.length() < 2) {
            System.out.println("Error: Invalid formatting. Example format: A3");
            return;
        }

        int rowIndex = Character.toUpperCase(seatRef.charAt(0)) - 'A';
        int colIndex;
        
        try {
                        colIndex = Integer.parseInt(seatRef.substring(1)) - 1;
        } catch (NumberFormatException e) {
            System.out.println("Error: Column index must be a numeric value.");
            return;
        }

        if (rowIndex < 0 || rowIndex >= ROWS || colIndex < 0 || colIndex >= COLS) {
            System.out.println("Error: Selected position lies outside our map bounds.");
            return;
        }

        if (seatingChart[rowIndex][colIndex] == BOOKED) {
            System.out.println("Error: This designated seat is already reserved.");
        } else {
            seatingChart[rowIndex][colIndex] = BOOKED;
            System.out.printf("Success! Seat %s booked. Total Fee: $%.2f\n", seatRef.toUpperCase(), TICKET_PRICE);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question3 system = new Question3();
        boolean active = true;
         System.out.println("=== Welcome to the Automated Ticketing Portal ===");

        while (active) {
            System.out.println("\n1. View Seating Chart");
            System.out.println("2. Reserve a Ticket");
            System.out.println("3. Exit Application");
            System.out.print("Select an option: ");
            
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    system.displaySeats();
                    break;
                case "2":
                    System.out.print("Enter Seat Reference (e.g., B4): ");
                    String selection = scanner.nextLine().trim();
                    system.bookSeat(selection);
                    break;
                case "3":
                    active = false;
                    System.out.println("Thank you for using our booking platform. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection. Please submit options 1, 2, or 3.");
            }
        }
    }
}
