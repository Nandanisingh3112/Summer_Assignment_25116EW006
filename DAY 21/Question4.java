import java.util.*;
public class Question4 {
//convert lowercase to uppercase
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string : ");
    String lowercase = sc.nextLine();
    String uppercase = lowercase.toUpperCase();
    System.out.println(uppercase);
}
}
