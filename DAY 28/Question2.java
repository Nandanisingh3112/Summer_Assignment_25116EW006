import java.util.ArrayList;
import java.util.Scanner;
//BANK ACCOUNT SYSTEM

// Component 1: The BankAccount class handling account state and operations
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Parameterized constructor to initialize a new bank account
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getters for account values
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
         }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money safely with input verification
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println(" Error: Deposit amount must be positive.");
        }
    }

    // Method to withdraw money with limit validation
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" Error: Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println(" Error: Insufficient funds. Available balance: $" + balance);
        } else {
            balance -= amount;
                        System.out.println(" Successfully withdrew: $" + amount);
        }
    }

    // Prints specific customer details
    public void displayAccountInfo() {
        System.out.println("\n--- Account Summary ---");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: $" + balance);
        System.out.println("-----------------------");
    }
}
public class Question2 {
    private static ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        System.out.println("=== Welcome to Apex Bank System ===");

        // Application engine loop
        do {
            System.out.println("\nMain Navigation Menu:");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance / Account Info");
            System.out.println("5. Exit System");
            System.out.print("Please enter choice (1-5): ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid type! Choose a number (1-5): ");
                scanner.next();
            }
            choice = scanner.nextInt();
             scanner.nextLine(); // Clear newline buffer

            switch (choice) {
                case 1:
                    createNewAccount();
                    break;
                case 2:
                    performDeposit();
                    break;
                case 3:
                    performWithdrawal();
                    break;
                case 4:
                    checkAccountInfo();
                    break;
                case 5:
                    System.out.println("\nThank you for using Apex Bank. Goodbye!");
                    break;
                default:
                    System.out.println(" Choice out of bounds. Select 1 through 5.");
            }
        } while (choice != 5);

        scanner.close();
        }

    // Logic to handle new registration workflows
    private static void createNewAccount() {
        System.out.print("\nEnter full name of Account Holder: ");
        String name = scanner.nextLine();
        
        System.out.print("Create a unique Account Number: ");
        String accNum = scanner.nextLine();

        // Check if account number already exists
        if (findAccount(accNum) != null) {
            System.out.println("❌ Registration Failed: Account number already exists.");
            return;
        }

        System.out.print("Enter initial opening deposit balance: $");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid amount! Enter an opening number: $");
            scanner.next();
        }
        double initialBalance = scanner.nextDouble();

        if (initialBalance < 0) {
            System.out.println("❌ Registration Failed: Opening balance cannot be negative.");
            return;
              }

        BankAccount newAccount = new BankAccount(name, accNum, initialBalance);
        bankAccounts.add(newAccount);
        System.out.println(" Account successfully created for " + name + "!");
    }

    // Logic to deposit money into existing profiles
    private static void performDeposit() {
        System.out.print("\nEnter the Account Number: ");
        String accNum = scanner.nextLine();
        BankAccount account = findAccount(accNum);

        if (account != null) {
            System.out.print("Enter amount to deposit: $");
            double amount = getValidDoubleInput();
            account.deposit(amount);
        } else {
            System.out.println(" Target account registration not found.");
        }
    }

    // Logic to withdraw money from profiles
    private static void performWithdrawal() {
        System.out.print("\nEnter the Account Number: ");
         String accNum = scanner.nextLine();
        BankAccount account = findAccount(accNum);

        if (account != null) {
            System.out.print("Enter amount to withdraw: $");
            double amount = getValidDoubleInput();
            account.withdraw(amount);
        } else {
            System.out.println(" Target account registration not found.");
        }
    }

    // Logic to view specific registration details
    private static void checkAccountInfo() {
        System.out.print("\nEnter the Account Number: ");
        String accNum = scanner.nextLine();
        BankAccount account = findAccount(accNum);

        if (account != null) {
            account.displayAccountInfo();
        } else {
            System.out.println("Target account registration not found.");
        }
    }
    // Helper search method utilizing Java Arrays structures
    private static BankAccount findAccount(String accountNumber) {
        for (BankAccount account : bankAccounts) {
            if (account.getAccountNumber().equalsIgnoreCase(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    // Universal data fallback processor
    private static double getValidDoubleInput() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid value input. Enter an amount: $");
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine(); // Clear buffer
        return value;
    }
}

    

