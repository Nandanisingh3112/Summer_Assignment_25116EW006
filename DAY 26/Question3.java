import java.util.Scanner;
 class BankAccount {
//program to create ATM simulation
private double balance;
private int pin;
public BankAccount(double initialBalance , int initialPin){
    this.balance = initialBalance;
    this.pin = initialPin;
}
public double getBalance(){
    return balance;
}
public boolean validatePin(int enteredPin){
    return this.pin == enteredPin;
}
public void deposit(double amount){
    if(amount>0){
        balance += amount;
        System.out.printf("Successfully deposited: $%.2f\n" , amount);
    }else{
        System.out.println("Invalid deposit amount.");
    }
}
public boolean withdraw(double amount){
    if(amount<=0){
        System.out.println("Invalid withdrwal amount.");
        return false;
    }
    if(amount>balance){
        System.out.println("Error : Insufficient balance.");
        return false;
    }
    balance -= amount;
    System.out.printf("Successfully withdrew: $%.2f\n ", amount);
    return true;
}
}
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(2000.00, 1234);
        System.out.println("===Welcome to Java ATM Simulation===");
        int pinAttempts = 0;
        boolean authenticated = false;
        while(pinAttempts<3){
            System.out.println("Enter your 4 digit pin: ");
            int enteredPin = sc.nextInt();
            if(userAccount.validatePin(enteredPin)){
                authenticated = true;
                break;
            }else{
                pinAttempts++;
                System.out.println("Incorrect PIN. Remaining attempts: "+(3 - pinAttempts));
            }
        }
        if(!authenticated){
            System.out.println("Too many incorrect attempts. Your card has been blocked.");
            return;
        }
        int choice;
        do{
            System.out.println("\n---ATM Main Menu---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit session");
            System.out.println("Select an option (1-4):");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.printf("Your current balance is $%.2f\n , userAccount.getBalance()");
                    break;
                case 2:
                    System.out.print("Enter deposit amount : $");
                    double depositAmount = sc.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawl amount : $");
                    double withdrawlAmount = sc.nextDouble();
                    userAccount.withdraw(withdrawlAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM services. GOODBYE!");
                    break;
                default: 
                    System.out.println("Invalid section. please choose an option from 1 to 4.");
            }
        }
        while(choice != 4);
    }
}

        

            
        

        
    


