import java.util.*;
public class Question2 {
//reverse a string
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string : ");
    String original = sc.nextLine();
    String reversed = new StringBuilder(original).reverse().toString();
    System.out.println("original : "+ original);
    System.out.println("reversed : "+ reversed);
}
}
