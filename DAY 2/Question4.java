import java.util.*;
public class Question4 {
    public static void main(String[]args){
    //check whether a number is palindrome
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int original = n;
    int reverse = 0;
    while(n>0){
       int digit = n%10;
       reverse = reverse * 10 + digit;
       n = n/10;
    }
    if(original==reverse){
        System.out.println("The given number is palindrome");
    }else{
        System.out.println("The given number is not a palindrome");
    }
    }
    }
