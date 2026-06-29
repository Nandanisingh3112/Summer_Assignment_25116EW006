import java.util.Scanner;
//MENU-DRIVEN STRING OPERATION SYSTEM
public class Question3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== STRING OPERATIONS SYSTEM ===");
            System.out.println("1. Find Length of a String");
            System.out.println("2. Concatenate Two Strings");
            System.out.println("3. Reverse a String");
            System.out.println("4. Compare Two Strings");
            System.out.println("5. Convert to Upper/Lower Case");
            System.out.println("6. Check if String Contains a Substring");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String str1 = scanner.nextLine();
                    System.out.println("Length: " + str1.length());
                    break;
                case 2:
                    System.out.print("Enter first string: ");
                    String con1 = scanner.nextLine();
                    System.out.print("Enter second string: ");
                    String con2 = scanner.nextLine();
                    System.out.println("Concatenated String: " + con1.concat(con2));
                    break;

                case 3:
                    System.out.print("Enter a string to reverse: ");
                    String revTarget = scanner.nextLine();
                    String reversed = new StringBuilder(revTarget).reverse().toString();
                    System.out.println("Reversed String: " + reversed);
                    break;

                case 4:
                    System.out.print("Enter first string: ");
                    String comp1 = scanner.nextLine();
                    System.out.print("Enter second string: ");
                    String comp2 = scanner.nextLine();
                    if (comp1.equals(comp2)) {
                        System.out.println("Result: Both strings are perfectly equal.");
                    } else if (comp1.equalsIgnoreCase(comp2)) {
                        System.out.println("Result: Strings match (ignoring case differences).");
                    } else {
                        System.out.println("Result: Strings are completely different.");
                          }
                    break;

                case 5:
                    System.out.print("Enter a string: ");
                    String caseStr = scanner.nextLine();
                    System.out.println("Uppercase: " + caseStr.toUpperCase());
                    System.out.println("Lowercase: " + caseStr.toLowerCase());
                    break;

                case 6:
                    System.out.print("Enter main string: ");
                    String mainStr = scanner.nextLine();
                    System.out.print("Enter substring to search for: ");
                    String subStr = scanner.nextLine();
                    if (mainStr.contains(subStr)) {
                        System.out.println("Result: Substring found at index " + mainStr.indexOf(subStr));
                    } else {
                        System.out.println("Result: Substring not found.");
                    }
                    break;

                case 7:
                    System.out.println("Thank you for using the String Operations System. Goodbye!");
                    break;
                     default:
                    System.out.println("Error: Invalid choice! Please enter a number between 1 and 7.");
            }
        } while (choice != 7);
    }
}
    

