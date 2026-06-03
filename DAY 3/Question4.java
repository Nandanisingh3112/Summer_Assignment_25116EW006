import java.util.*;
public class Question4 {
    public static void main(String[]args){
    //find LCM of two numbers
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number :");
    int a = sc.nextInt();
    System.out.println("Enter second number :");
    int b = sc.nextInt();
    int num1 = a;
    int num2 = b;
    int temp = 0;
    while(b!=0){
        temp = b;
        b = a%b;
        a = temp;
    }
    int GCD = a;
    int LCM = (num1 * num2)/GCD;
    System.out.println("LCM = " + LCM);
}
    }
