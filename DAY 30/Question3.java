import java.util.ArrayList;
import java.util.Scanner;
//MINI EMPLOYEE MANAGEMENT SYSTEM
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Department: " + department + " | Salary: $" + salary;
    }
}
public class Question3 {
     private static ArrayList<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== MINI EMPLOYEE MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: addEmployee(); break;
                case 2: viewEmployees(); break;
                case 3: searchEmployee(); break;
                case 4: updateEmployee(); break;
                case 5: deleteEmployee(); break;
                case 6: 
                    System.out.println("Exiting System. Goodbye!");
                    System.exit(0);
                default: 
                    System.out.println("Invalid choice! Please select between 1 and 6.");
            }
        }
    }

    // 1. Add Employee Record
    private static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                System.out.println("Error: Employee with ID " + id + " already exists.");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        employeeList.add(new Employee(id, name, dept, salary));
        System.out.println("Employee added successfully!");
    }

    // 2. View All Employee Records
    private static void viewEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employee records found.");
            return;
        }
        System.out.println("\n--- Employee List ---");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

    // 3. Search Employee by ID
    private static void searchEmployee() {
        System.out.print("Enter Employee ID to search: ");
        int id = scanner.nextInt();

        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                System.out.println("\nRecord Found:\n" + emp);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    // 4. Update Employee Record
    private static void updateEmployee() {
        System.out.print("Enter Employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                System.out.print("Enter New Name: ");
                emp.setName(scanner.nextLine());
                System.out.print("Enter New Department: ");
                emp.setDepartment(scanner.nextLine());
                System.out.print("Enter New Salary: ");
                emp.setSalary(scanner.nextDouble());
                
                System.out.println("Employee record updated successfully!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    // 5. Delete Employee Record
    private static void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        int id = scanner.nextInt();

        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                employeeList.remove(emp);
                System.out.println("Employee record deleted successfully!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }
}

