import java.util.Scanner;
//MINI PROJECT USING ARRAY, STRING AND FUNCTION

public class Question4 {
     static String[] taskNames = new String[100];
    static String[] taskStatuses = new String[100];
    static int taskCount = 0; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=== Welcome to the Java Task Manager Mini-Project ===");

        // Main program loop
        do {
            displayMenu();
            System.out.print("Enter your choice (1-5): ");
            
            // Validate integer input
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); 

            // Menu routing using functions
            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskAsComplete(scanner);
                    break;
                case 4:
                    searchTask(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please pick a choice between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Function 1: Displays the menu interface
    public static void displayMenu() {
        System.out.println("\n----------------------------");
        System.out.println("1. Add a New Task");
        System.out.println("2. View All Tasks");
        System.out.println("3. Mark a Task as Complete");
        System.out.println("4. Search for a Task");
        System.out.println("5. Exit Application");
        System.out.println("----------------------------");
    }

    // Function 2: Adds a task string into the array
    public static void addTask(Scanner scanner) {
        if (taskCount >= taskNames.length) {
            System.out.println("Error: Task list is full! Cannot add more tasks.");
            return;
        }

        System.out.print("Enter the task description: ");
        String newTask = scanner.nextLine().trim();

        // String operation check for empty entry
        if (newTask.isEmpty()) {
            System.out.println("Error: Task description cannot be blank!");
            return;
        }

        // Inserting elements into our arrays
        taskNames[taskCount] = newTask;
        taskStatuses[taskCount] = "Pending"; // Initial default status
        taskCount++;

        System.out.println("Success: Task added successfully!");
    }

    // Function 3: Iterates and views array records
    public static void viewTasks() {
        if (taskCount == 0) {
            System.out.println("No tasks available to display.");
            return;
        }

        System.out.println("\n--- Current Task List ---");
        for (int i = 0; i < taskCount; i++) {
            System.out.println((i + 1) + ". [" + taskStatuses[i] + "] " + taskNames[i]);
        }
    }

    // Function 4: Updates status string at specific array index
    public static void markTaskAsComplete(Scanner scanner) {
        if (taskCount == 0) {
            System.out.println("No tasks available to modify.");
            return;
        }

        viewTasks();
        System.out.print("Enter the task number to mark as completed: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        // Bound-checking array indices
        if (taskNumber < 1 || taskNumber > taskCount) {
            System.out.println("Error: Invalid task number selected!");
        } else {
            // Update String data inside the array
            taskStatuses[taskNumber - 1] = "Completed";
            System.out.println("Success: Task #" + taskNumber + " status updated to Completed.");
        }
    }

    // Function 5: Demonstrates String searching algorithms inside arrays
    public static void searchTask(Scanner scanner) {
        if (taskCount == 0) {
            System.out.println("No tasks available to search.");
            return;
        }

        System.out.print("Enter search keyword: ");
        String keyword = scanner.nextLine().trim().toLowerCase();

        System.out.println("\n--- Search Results ---");
        boolean found = false;

        for (int i = 0; i < taskCount; i++) {
            // String function .toLowerCase() and .contains() used here for case-insensitive lookup
            if (taskNames[i].toLowerCase().contains(keyword)) {
                System.out.println((i + 1) + ". [" + taskStatuses[i] + "] " + taskNames[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching tasks found containing keyword: '" + keyword + "'");
        }
    }
}
    

