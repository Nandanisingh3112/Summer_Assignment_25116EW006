import java.util.*;
public class Question1{
//write function for palindrome number
    public static int Palindrome(int n){
        int reverse = 0;
        while(n>0){
            int digit = n%10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }
        return reverse;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        int original = n;
        if(original == Palindrome(n)){
            System.out.println("the given number is palindrome.");
        }else{
            System.out.println("the given number is not a palindrome");
        }
    }
    }
    

