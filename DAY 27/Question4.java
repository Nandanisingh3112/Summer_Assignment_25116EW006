import java.util.Scanner;
//MARKSHEET GENERATION SYSTEM
class Student {
    private String name;
    private String rollNumber;
    private String[] subjects;
    private int[] marks;
    private final int MAX_MARKS_PER_SUBJECT = 100;
    public Student(String name, String rollNumber, String[] subjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = subjects;
        this.marks = new int[subjects.length];
    }
    public void inputMarks(Scanner scanner) {
        System.out.println("\n--- Entering Marks for " + name + " ---");
        for (int i = 0; i < subjects.length; i++) {
            while (true) {
                System.out.print("Enter marks for " + subjects[i] + " (0-100): ");
                if (scanner.hasNextInt()) {
                    int mark = scanner.nextInt();
                     if (mark >= 0 && mark <= MAX_MARKS_PER_SUBJECT) {
                        marks[i] = mark;
                        break;
                    } else {
                        System.out.println("Invalid score! Please enter marks between 0 and 100.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a numerical integer value.");
                    scanner.next(); 
                }
            }
        }
    }
    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    public double calculatePercentage() {
        int totalMarks = calculateTotal();
        return (double) totalMarks / subjects.length;
    }
    public String calculateGrade(double percentage) {
        if (percentage >= 85) return "A+ (Excellent)";
        if (percentage >= 70) return "A (Very Good)";
        if (percentage >= 55) return "B (Good)";
        if (percentage >= 40) return "C (Pass)";
        return "F (Fail)";
    }
    public String getStatus() {
        for (int mark : marks) {
            if (mark < 40) { 
                return "FAIL (Failed in one or more subjects)";
            }
        }
        return "PASS";
    }
     public void displayMarksheet() {
        int grandTotal = calculateTotal();
        double percentage = calculatePercentage();
        int maxPossibleMarks = subjects.length * MAX_MARKS_PER_SUBJECT;

        System.out.println("\n=============================================");
        System.out.println("             OFFICIAL MARKSHEET              ");
        System.out.println("=============================================");
        System.out.printf(" Student Name : %-25s \n", name);
        System.out.printf(" Roll Number  : %-25s \n", rollNumber);
        System.out.println("---------------------------------------------");
        System.out.printf(" %-20s | %-15s \n", "SUBJECT", "MARKS OBTAINED");
        System.out.println("---------------------------------------------");
        
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf(" %-20s | %-15d \n", subjects[i], marks[i]);
        }
        
        System.out.println("---------------------------------------------");
        System.out.printf(" Total Secured: %d / %d\n", grandTotal, maxPossibleMarks);
        System.out.printf(" Percentage   : %.2f%%\n", percentage);
        System.out.printf(" Final Grade  : %s\n", calculateGrade(percentage));
        System.out.printf(" Status       : %s\n", getStatus());
        System.out.println("=============================================");
    }
}

public class Question4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Welcome to the Marksheet Generation System ===");
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        String rollNumber = scanner.nextLine();
        String[] curriculum = {"Mathematics", "Physics", "Chemistry", "English", "Computer Science"};
        Student student = new Student(name, rollNumber, curriculum);
        student.inputMarks(scanner);
        student.displayMarksheet();
    }
}
    

