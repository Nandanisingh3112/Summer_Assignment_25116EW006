import java.util.Scanner;
//MENU-DRIVEN CALCULATOR
public class Question1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2;

        do {
            System.out.println("\n--- Calculator Menu ---\n1.Add\n2.Sub\n3.Mul\n4.Div\n5.Exit");
            System.out.print("Enter choice (1-5): ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter two numbers: ");
                num1 = scanner.nextDouble();
                num2 = scanner.nextDouble();

                switch (choice) {
                    case 1 -> System.out.println("Result: " + (num1 + num2));
                    case 2 -> System.out.println("Result: " + (num1 - num2));
                    case 3 -> System.out.println("Result: " + (num1 * num2));
                    case 4 -> {
                        if (num2 != 0) System.out.println("Result: " + (num1 / num2));
                        else System.out.println("Error: Div by zero");
                    }
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}
    

