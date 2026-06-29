import java.util.Scanner;
//MENU-DRIVEN ARRAY OPERATION SYSTEM
public class Question2 {
     private static int[] array;
    private static int currentSize = 0;
    private static final int MAX_CAPACITY = 100; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        array = new int[MAX_CAPACITY];
        int choice;

        System.out.println("=== Welcome to the Array Operation System ===");
        System.out.print("Enter the number of initial elements: ");
        int initialCount = scanner.nextInt();
        if (initialCount > MAX_CAPACITY) {
            System.out.println("Exceeds capacity. Setting initial elements to 0.");
            initialCount = 0;
        }
        
        if (initialCount > 0) {
            System.out.println("Enter " + initialCount + " elements:");
            for (int i = 0; i < initialCount; i++) {
                array[i] = scanner.nextInt();
            }
            currentSize = initialCount;
              }
        do {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Display Array (Traverse)");
            System.out.println("2. Insert Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Search Element (Linear Search)");
            System.out.println("5. View Array Statistics (Min, Max, Sum)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayArray();
                    break;
                case 2:
                    System.out.print("Enter element to insert: ");
                    int elementToInsert = scanner.nextInt();
                    System.out.print("Enter position index (0 to " + currentSize + "): ");
                    int insertIndex = scanner.nextInt();
                    insertElement(elementToInsert, insertIndex);
                    break;
                case 3:
                    System.out.print("Enter position index to delete (0 to " + (currentSize - 1) + "): ");
                    int deleteIndex = scanner.nextInt();
                    deleteElement(deleteIndex);
                    break;
                case 4:
                    System.out.print("Enter target element to find: ");
                    int target = scanner.nextInt();
                    int searchResult = searchElement(target);
                    if (searchResult != -1) {
                        System.out.println("Element found at index: " + searchResult);
                    } else {
                        System.out.println("Element not found in the array.");
                    }
                    break;
                case 5:
                    showStatistics();
                    break;
                case 6:
                    System.out.println("Exiting System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please pick a choice between 1 and 6.");
            }
        } while (choice != 6);
            }

    // 1. Traverse and Display Array Elements
    private static void displayArray() {
        if (currentSize == 0) {
            System.out.println("The array is completely empty.");
            return;
        }
        System.out.print("Array elements: [");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(array[i]);
            if (i < currentSize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // 2. Insert Element at a Specific Index
    private static void insertElement(int element, int index) {
        if (currentSize >= MAX_CAPACITY) {
            System.out.println("Error: System out of memory bounds. Array is full.");
            return;
        }
        if (index < 0 || index > currentSize) {
             System.out.println("Error: Invalid position index out of range.");
            return;
        }
        // Shift elements to the right to clear room
        for (int i = currentSize; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        currentSize++;
        System.out.println("Successfully inserted " + element + " at index " + index);
    }

    // 3. Delete Element from a Specific Index
    private static void deleteElement(int index) {
        if (currentSize == 0) {
            System.out.println("Error: Underflow. Cannot delete from an empty array.");
            return;
        }
        if (index < 0 || index >= currentSize) {
            System.out.println("Error: Index out of structural range.");
            return;
        }
        int removedValue = array[index];
        for (int i = index; i < currentSize - 1; i++) {
            array[i] = array[i + 1];
             }
        currentSize--;
        System.out.println("Successfully deleted element " + removedValue + " from index " + index);
    }

    // 4. Linear Search for Target Value
    private static int searchElement(int target) {
        for (int i = 0; i < currentSize; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return - 1; 
    }

    // 5. Gather metrics (Min, Max, Sum)
    private static void showStatistics() {
        if (currentSize == 0) {
            System.out.println("No metrics available. Array is empty.");
            return;
        }
        int min = array[0];
        int max = array[0];
        int sum = 0;

        for (int i = 0; i < currentSize; i++) {
             if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
            sum += array[i];
        }
        System.out.println("--- Array Statistics ---");
        System.out.println("Minimum Value : " + min);
        System.out.println("Maximum Value : " + max);
        System.out.println("Sum of Entries: " + sum);
    }
} 



    

