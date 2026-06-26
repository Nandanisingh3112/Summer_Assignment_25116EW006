import java.util.Scanner;
public class Question2 {
//program to create voting eligibility system
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to voting eligibilty system!");
    System.out.println("Enter your age : ");
    int age = sc.nextInt();
    if(age>=18){
        System.out.println("You are eligible to vote!");
    }else if(age>0){
        int yearsleft = 18 - age;
        System.out.println("You are not eligible to vote yet.Please wait "+ yearsleft + " more years.");
    }else{
        System.out.println("Invalid age entered.Please enter a valid positive number.");
    }
}
}
