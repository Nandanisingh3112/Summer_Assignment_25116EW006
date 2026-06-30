import java.util.Scanner;
//STUDENT RECORD SYSTEM USING ARRAYS AND STRING
class Student {
    private String id;
    private String name;
    private String course;

    // Constructor to initialize variables
    public Student(String id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    // Getters and Setters for data manipulation
    public String getId() { return id; }
    public void setName(String name) { this.name = name; }
    public void setCourse(String course) { this.course = course; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Course: " + course;
    }
}

public class Question1 {
    private static final int MAX_STUDENTS = 100; 
    private static Student[] students = new Student[MAX_STUDENTS];
    private static int studentCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== STUDENT RECORD SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student Details");
            System.out.println("5. Delete Student Record");
            System.out.println("6. Exit");
            System.out.print("Select an option (1-6): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(); break;
                case 4: updateStudent(); break;
                case 5: deleteStudent(); break;
                case 6: 
                    System.out.println("Exiting application. Goodbye!");
                    System.exit(0);
                default: 
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    // 1. CREATE: Add a new student record
    private static void addStudent() {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("Database full! Cannot add more records.");
            return;
        }

        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        // Check for duplicate ID entry
        if (findStudentIndex(id) != -1) {
            System.out.println("Error: A student with this ID already exists.");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Course: ");
        String course = scanner.nextLine();

        students[studentCount] = new Student(id, name, course);
        studentCount++;
        System.out.println("Record added successfully!");
    }

    // 2. READ: View all active student records
    private static void viewStudents() {
        if (studentCount == 0) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\n--- Current Student Records ---");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }

    // 3. READ: Search record by ID using string comparison
    private static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        String id = scanner.nextLine();
        int index = findStudentIndex(id);

        if (index != -1) {
            System.out.println("Record Found -> " + students[index]);
        } else {
            System.out.println("Record not found.");
        }
    }

    // 4. UPDATE: Modify text data based on ID lookup
    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        String id = scanner.nextLine();
        int index = findStudentIndex(id);

        if (index == -1) {
            System.out.println("Record not found.");
            return;
        }

        System.out.print("Enter New Name: ");
        students[index].setName(scanner.nextLine());
        System.out.print("Enter New Course: ");
        students[index].setCourse(scanner.nextLine());
        System.out.println("Record updated successfully!");
    }

    // 5. DELETE: Remove record and shift array elements leftward
    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        String id = scanner.nextLine();
        int index = findStudentIndex(id);

        if (index == -1) {
            System.out.println("Record not found.");
            return;
        }
        for (int i = index; i < studentCount - 1; i++) {
            students[i] = students[i + 1];
        }
        students[studentCount - 1] = null; 
        studentCount--;
        System.out.println("Record deleted successfully!");
    }
    private static int findStudentIndex(String id) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                return i; 
            }
        }
        return -1; 
    }
}

    

