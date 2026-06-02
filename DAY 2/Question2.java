import java.util.*;
public class Question2 {
    public static void main(String[]args){
    //reverse a number
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    int reverse = 0;
    while(n>0){
        int digit = n%10;
        reverse = reverse * 10 + digit;
        n = n/10;
    }
    System.out.println("Reversed number = " + reverse);
    }
    }
