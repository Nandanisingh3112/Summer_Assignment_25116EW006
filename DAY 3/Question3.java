import java.util.*;
public class Question3 {
    public static void main(String[]args){
    //find GCD of two numbers
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number :");
    int a = sc.nextInt();
    System.out.println("Enter second number :");
    int b = sc.nextInt();
    int temp = 0;
    while(b!=0){
    temp = b;
    b = a%b;
    a = temp;
    }
    System.out.println("GCD = "+ a);
}  
}
