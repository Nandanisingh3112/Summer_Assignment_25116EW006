import java.util.ArrayList;
import java.util.Scanner;
//CONTACT MANAGEMENT SYSTEM
class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    // Constructor
    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
         this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Override toString to elegantly print contact details
    @Override
    public String toString() {
        return "Name: " + name + " | Phone: " + phoneNumber + " | Email: " + email;
    }
}
public class Question4 {
    private static final ArrayList<Contact> contactList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add New Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number between 1 and 5: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the trailing newline character

            switch (choice) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                  case 3 -> searchContact();
                case 4 -> deleteContact();
                case 5 -> System.out.println("Exiting the application. Goodbye!");
                default -> System.out.println("Invalid option! Please pick a number from 1 to 5.");
            }
        } while (choice != 5);
    }

    // Operation 1: Add a contact
    private static void addContact() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine().trim();
        
        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine().trim();
        
        System.out.print("Enter Email Address: ");
        String email = scanner.nextLine().trim();

        if (name.isEmpty() || phone.isEmpty()) {
            System.out.println("Failed to add: Name and Phone Number cannot be blank!");
            return;
        }

        contactList.add(new Contact(name, phone, email));
        System.out.println("Contact successfully saved!");
         }

    // Operation 2: View all contacts
    private static void viewContacts() {
        if (contactList.isEmpty()) {
            System.out.println("Your contact book is empty.");
            return;
        }

        System.out.println("\n--- Saved Contacts ---");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i + 1) + ". " + contactList.get(i));
        }
    }

    // Operation 3: Search contact by name
    private static void searchContact() {
        System.out.print("Enter the name to search: ");
        String query = scanner.nextLine().trim();
        boolean found = false;

        for (Contact contact : contactList) {
            // Case-insensitive, partial matching
            if (contact.getName().toLowerCase().contains(query.toLowerCase())) {
                 System.out.println("[Found] " + contact);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching contact found for: " + query);
        }
    }

    // Operation 4: Delete a contact
    private static void deleteContact() {
        System.out.print("Enter the exact name of the contact to delete: ");
        String targetName = scanner.nextLine().trim();
        Contact toRemove = null;

        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(targetName)) {
                toRemove = contact;
                break;
            }
        }

        if (toRemove != null) {
            contactList.remove(toRemove);
            System.out.println("Contact '" + targetName + "' removed successfully.");
}else{
    System.out.println("contact not found");
}
}
}