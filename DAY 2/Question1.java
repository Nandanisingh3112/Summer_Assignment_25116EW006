import java.util.*;
public class Question1 {
    public static void main(String[]args){
    //sum of digits of a number
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int n = sc.nextInt();
    int sum = 0;
    while(n>0){
        int digit = n%10;
        sum = sum + digit;
        n = n/10;
    }
    System.out.println(sum);
    }
    }
