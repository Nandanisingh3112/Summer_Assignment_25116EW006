import java.util.*;
public class Question3 {
    public static void main(String[]args){
    //product of digits of a number
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    int product = 1;
    while(n>0){
        int digit = n%10;
        product = product * digit;
        n = n/10;
    }
    System.out.println("Product of digits = " + product);
    }
    }
