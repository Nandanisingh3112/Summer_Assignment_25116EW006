import java.util.*;
public class Question3 {
    public static void main(String[]args){
    //check Armstrong number
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int n = sc.nextInt();
    int original = n;
    int armstrong = 0;
    int digits = String.valueOf(n).length();
    int temp =n;
    while(temp!=0){
        int digit = temp%10;
        armstrong += Math.pow(digit , digits);
        temp = temp/10;
    }
    if(original==armstrong){
    System.out.println(original + " is an Armstrong number");
    }else{
        System.out.println(original + " is not an Armstrong number");
    }
}
}
