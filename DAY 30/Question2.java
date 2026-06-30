import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//MINI LIBRARY SYSTEM
class Book {
    private final String id;
    private final String title;
    private final String author;
    private boolean isBorrowed;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isBorrowed() { return isBorrowed; }

    public void borrowBook() { this.isBorrowed = true; }
    public void returnBook() { this.isBorrowed = false; }

    @Override
    public String toString() {
        String status = isBorrowed ? "Borrowed" : "Available";
        return String.format("ID: %-5s | Title: %-25s | Author: %-20s | Status: %s", id, title, author, status);
    }

public class Question2 {
    private static final List<Book> library = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Pre-populating default books for immediate testing
        library.add(new Book("101", "Effective Java", "Joshua Bloch"));
        library.add(new Book("102", "Clean Code", "Robert C. Martin"));
        library.add(new Book("103", "Head First Java", "Kathy Sierra"));

        while (true) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> viewAllBooks();
                case 3 -> borrowBook();
                case 4 -> returnBook();
                case 5 -> {
                    System.out.println("\nExiting system. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try choices 1-5.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n========== MINI LIBRARY MENU ==========");
        System.out.println("1. Add New Book");
        System.out.println("2. View All Books");
        System.out.println("3. Borrow a Book");
        System.out.println("4. Return a Book");
        System.out.println("5. Exit System");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void addBook() {
        System.out.print("\nEnter Book ID: ");
        String id = scanner.nextLine().trim();
        
        if (findBookById(id) != null) {
            System.out.print("Error: A book with this ID already exists.");
            return;
        }

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine().trim();

        if (id.isEmpty() || title.isEmpty() || author.isEmpty()) {
            System.out.println("Error: Fields cannot be blank.");
            return;
        }

        library.add(new Book(id, title, author));
        System.out.println("Success: Book added successfully.");
    }

    private static void viewAllBooks() {
        if (library.isEmpty()) {
            System.out.println("\nThe library catalog is currently empty.");
            return;
        }
        System.out.println("\n------------------------- LIBRARY CATALOG -------------------------");
        for (Book book : library) {
            System.out.println(book);
        }
        System.out.println("-------------------------------------------------------------------");
    }

    private static void borrowBook() {
        System.out.print("\nEnter Book ID to borrow: ");
        String id = scanner.nextLine();
        Book book = findBookById(id);

        if (book == null) {
            System.out.println("Error: Book ID not found.");
        } else if (book.isBorrowed()) {
            System.out.println("Error: Book is already checked out.");
        } else {
            book.borrowBook();
            System.out.println("Success: You checked out '" + book.getTitle() + "'.");
        }
    }

    private static void returnBook() {
        System.out.print("\nEnter Book ID to return: ");
        String id = scanner.nextLine();
        Book book = findBookById(id);

        if (book == null) {
            System.out.println("Error: Book ID not found.");
        } else if (!book.isBorrowed()) {
            System.out.println("Error: This book was not checked out.");
        } else {
            book.returnBook();
            System.out.println("Success: You returned '" + book.getTitle() + "'.");
        }
    }

    private static Book findBookById(String id) {
        for (Book book : library) {
            if (book.getId().equalsIgnoreCase(id)) {
                return book;
            }
        }
        return null;
    }
}
}
