import java.util.ArrayList;
import java.util.Scanner;
//SALARY MANAGEMENT SYSTEM
class Employee {
    private String id;
    private String name;
    private String designation;
    private double basicSalary;

    public Employee(String id, String name, String designation, double basicSalary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }
    public double calculateHRA() { return basicSalary * 0.15; }     
    public double calculateMedical() { return basicSalary * 0.08; } 
    public double calculatePF() { return basicSalary * 0.12; }      
    
    public double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateMedical();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getDesignation() { return designation; }
    public double getBasicSalary() { return basicSalary; }

    public void displayPayslip() {
        System.out.println("\n-------------------------------------------");
        System.out.println("               SALARY PAYSLIP              ");
        System.out.println("-------------------------------------------");
        System.out.printf("Employee ID   : %s\n", id);
        System.out.printf("Name          : %s\n", name);
        System.out.printf("Designation   : %s\n", designation);
        System.out.println("-------------------------------------------");
        System.out.printf("Basic Salary  : $%.2f\n", basicSalary);
        System.out.printf("HRA (15%%)     : $%.2f\n", calculateHRA());
        System.out.printf("Medical (8%%)  : $%.2f\n", calculateMedical());
        System.out.println("-------------------------------------------");
        System.out.printf("Gross Salary  : $%.2f\n", calculateGrossSalary());
        System.out.printf("PF Ded. (12%%) : $%.2f\n", calculatePF());
        System.out.println("-------------------------------------------");
        System.out.printf("NET TAKE-HOME : $%.2f\n", calculateNetSalary());
         System.out.println("-------------------------------------------\n");
    }
}
class SalaryManager {
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
        System.out.println(">>> Employee record successfully added.");
    }

    public void viewAllEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println(">>> No records found in the database.");
            return;
        }
        System.out.println("\n==========================================================================================");
        System.out.printf("%-10s %-20s %-20s %-15s %-15s\n", "ID", "Name", "Designation", "Basic Pay", "Net Salary");
        System.out.println("==========================================================================================");
        for (Employee emp : employeeList) {
            System.out.printf("%-10s %-20s %-20s $%-14.2f $%-14.2f\n", 
                emp.getId(), emp.getName(), emp.getDesignation(), emp.getBasicSalary(), emp.calculateNetSalary());
        }
        System.out.println("==========================================================================================\n");
    }

    public Employee findEmployee(String id) {
        for (Employee emp : employeeList) {
            if (emp.getId().equalsIgnoreCase(id)) {
                return emp;
            }
        }
        return null;
    }

    public void removeEmployee(String id) {
        Employee emp = findEmployee(id);
        if (emp != null) {
            employeeList.remove(emp);
            System.out.println(">>> Employee profile deleted successfully.");
        } else {
            System.out.println(">>> Error: Employee ID not found.");
        }
    }
}
public class Question3 {
     public static void main(String[] nullArgs) {
        SalaryManager manager = new SalaryManager();
        Scanner scanner = new Scanner(System.in);
    
        manager.addEmployee(new Employee("E001", "Alice Smith", "Software Engineer", 75000));
        manager.addEmployee(new Employee("E002", "Bob Johnson", "HR Manager", 62000));

        while (true) {
            System.out.println("======= SALARY MANAGEMENT SYSTEM =======");
            System.out.println("1. Add New Employee Record");
            System.out.println("2. View Registered Employees Summary");
            System.out.println("3. Fetch Specific Employee Payslip");
            System.out.println("4. Terminate Employee Profile");
            System.out.println("5. Exit Application");
            System.out.print("Select operational route (1-5): ");
            
            int targetChoice = scanner.nextInt();
            scanner.nextLine(); 

            switch (targetChoice) {
                case 1:
                    System.out.print("Enter Unique Alpha-Numeric ID: ");
                    String id = scanner.nextLine();
                    if (manager.findEmployee(id) != null) {
                        System.out.println(">>> Operational Fault: Duplicate ID matching this profile already exists.");
                        break;
                    }
                    System.out.print("Enter Full Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Corporate Designation: ");
                    String desig = scanner.nextLine();
                    System.out.print("Enter Contracted Base Pay Amount: ");
                    double salary = scanner.nextDouble();
                    
                    manager.addEmployee(new Employee(id, name, desig, salary));
                    break;

                case 2:
                    manager.viewAllEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID to fetch: ");
                    String searchId = scanner.nextLine();
                    Employee emp = manager.findEmployee(searchId);
                    if (emp != null) {
                        emp.displayPayslip();
                        } else {
                        System.out.println(">>> Records lookup failed: Employee ID not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    String deleteId = scanner.nextLine();
                    manager.removeEmployee(deleteId);
                    break;

                case 5:
                    System.out.println(">>> System shutting down. Secure payroll logs updated.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println(">>> Processing failure: Invalid entry parameter structural format.");
            }
        }
    }
}
    

