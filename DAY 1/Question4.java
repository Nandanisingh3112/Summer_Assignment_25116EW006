import java.util.*;
public class Question4 {
    public static void main(String[]args){
    //count digits in a number
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int n = sc.nextInt();
    int count = 0;
    while(n>0){
    int digit = n%10;
    count++; 
    n = n/10;
    } System.out.println("Number of digits = " + count);
    }
    }
