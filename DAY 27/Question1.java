import java.util.ArrayList;
import java.util.Scanner;
//STUDENT RECORD MANAGEMENT SYSTEM
class Student {
    private String id;
    private String name;
    private int age;
    private String course;
    public Student(String id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
     public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Age: " + age + " | Course: " + course;
    }
}
public class Question1 {
    private static final ArrayList<Student> studentList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== STUDENT RECORD MANAGEMENT SYSTEM ===");
            System.out.println("1. Add New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student Record");
            System.out.println("5. Delete Student Record");
            System.out.println("6. Exit Application");
            System.out.print("Select an option (1-6): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid menu number.");
                continue;
            }

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                 case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> {
                    System.out.println("Exiting application. Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid selection. Please choose options 1 through 6.");
            }
        }
    }
    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine().trim();
        if (findStudentById(id) != null) {
            System.out.println("Error: A student with ID " + id + " already exists.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine().trim();
        int age;
        while (true) {
            System.out.print("Enter Age: ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age <= 0) throw new NumberFormatException();
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a positive integer for age: ");
            }
        }

        System.out.print("Enter Course: ");
        String course = scanner.nextLine().trim();

        studentList.add(new Student(id, name, age, course));
        System.out.println("Success: Student record saved successfully!");
    }
    private static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No records found in the database.");
            return;
        }
        System.out.println("\n--- Current Student Records ---");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
    private static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        String id = scanner.nextLine().trim();
        Student student = findStudentById(id);

        if (student != null) {
            System.out.println("Record Found: " + student);
        } else {
            System.out.println("Error: Student with ID " + id + " not found.");
        }
    }
    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        String id = scanner.nextLine().trim();
        Student student = findStudentById(id);
        if (student == null) {
            System.out.println("Error: Student with ID " + id + " not found.");
            return;
        }

        System.out.print("Enter New Name (or press Enter to keep '" + student.getName() + "'): ");
        String newName = scanner.nextLine().trim();
        if (!newName.isEmpty()) student.setName(newName);

        System.out.print("Enter New Age (or press Enter to keep '" + student.getAge() + "'): ");
        String ageInput = scanner.nextLine().trim();
        if (!ageInput.isEmpty()) {
            try {
                int newAge = Integer.parseInt(ageInput);
                if (newAge > 0) student.setAge(newAge);
            } catch (NumberFormatException e) {
                System.out.println("Invalid age format. Keeping original value.");
            }
        }

        System.out.print("Enter New Course (or press Enter to keep '" + student.getCourse() + "'): ");
        String newCourse = scanner.nextLine().trim();
        if (!newCourse.isEmpty()) student.setCourse(newCourse);
         System.out.println("Success: Student record updated successfully!");
    }
    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        String id = scanner.nextLine().trim();
        Student student = findStudentById(id);

        if (student != null) {
            studentList.remove(student);
            System.out.println("Success: Student record removed successfully.");
        } else {
            System.out.println("Error: Student with ID " + id + " not found.");
        }
    }
    private static Student findStudentById(String id) {
        for (Student student : studentList) {
            if (student.getId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }
}




