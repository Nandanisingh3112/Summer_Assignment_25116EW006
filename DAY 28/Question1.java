import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//LIBRARY MANAGEMENT SYSTEM
class Book {
    private String id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) { isAvailable = available; }
      @Override
    public String toString() {
        return "ID: " + id + " | Title: " + title + " | Author: " + author + " | Status: " + (isAvailable ? "Available" : "Borrowed");
    }
}
class Member {
    private String memberId;
    private String name;
    private List<Book> borrowedBooks;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() { return memberId; }
    public String getName() { return name; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
        public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "Member ID: " + memberId + " | Name: " + name + " | Borrowed Books: " + borrowedBooks.size();
    }
}
class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Success: Book registered successfully!");
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Success: Member registered successfully!");
    }
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library inventory.");
            return;
        }
        System.out.println("\n--- Library Books ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book findBook(String id) {
        for (Book book : books) {
            if (book.getId().equalsIgnoreCase(id)) return book;
        }
        return null;
    }

    public Member findMember(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equalsIgnoreCase(memberId)) return member;
        }
        return null;
            }

    public void issueBook(String bookId, String memberId) {
        Book book = findBook(bookId);
        Member member = findMember(memberId);

        if (book == null) {
            System.out.println("Error: Book not found.");
            return;
        }
        if (member == null) {
            System.out.println("Error: Member not registered.");
            return;
        }
        if (!book.isAvailable()) {
            System.out.println("Error: Book is already checked out.");
            return;
        }

        book.setAvailable(false);
        member.borrowBook(book);
        System.out.println("Success: '" + book.getTitle() + "' issued to " + member.getName() + ".");
    }

    public void returnBook(String bookId, String memberId) {
        Book book = findBook(bookId);
         Member member = findMember(memberId);

        if (book == null || member == null) {
            System.out.println("Error: Invalid book or member ID combination.");
            return;
        }

        if (!member.getBorrowedBooks().contains(book)) {
            System.out.println("Error: This member did not borrow this book.");
            return;
        }

        book.setAvailable(true);
        member.returnBook(book);
        System.out.println("Success: '" + book.getTitle() + "' returned by " + member.getName() + ".");
    }
}
public class Question1 {
     public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        library.addBook(new Book("B01", "Effective Java", "Joshua Bloch"));
        library.addBook(new Book("B02", "Clean Code", "Robert Martin"));
        library.registerMember(new Member("M01", "Alice Smith"));

        while (true) {
            System.out.println("\n===== LIBRARY SYSTEM MENU =====");
            System.out.println("1. Add a New Book");
            System.out.println("2. Register a Member");
            System.out.println("3. Show All Books");
            System.out.println("4. Issue a Book");
            System.out.println("5. Return a Book");
            System.out.println("6. Exit");
            System.out.print("Select an option (1-6): ");

            String input = scanner.nextLine().trim();
            switch (input) {
                case "1":
                    System.out.print("Enter Unique Book ID: ");
                    String bId = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(bId, title, author));
                    break;
                case "2":
                    System.out.print("Enter Unique Member ID: ");
                    String mId = scanner.nextLine();
                    System.out.print("Enter Member Name: ");
                    String name = scanner.nextLine();
                    library.registerMember(new Member(mId, name));
                    break;
                case "3":
                    library.displayBooks();
                    break;
                case "4":
                    System.out.print("Enter Book ID to issue: ");
                    String issueBId = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    String issueMId = scanner.nextLine();
                    library.issueBook(issueBId, issueMId);
                    break;
                case "5":
                    System.out.print("Enter Book ID to return: ");
                    String retBId = scanner.nextLine();
                     System.out.print("Enter Member ID: ");
                    String retMId = scanner.nextLine();
                    library.returnBook(retBId, retMId);
                    break;
                case "6":
                    System.out.println("Closing application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please input a number from 1 to 6.");
            }
        }
    }
}
    

