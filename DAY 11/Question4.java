import java.util.*;
public class Question4 {
    public static void FindFactorial(int n){
    //write function to find factorial
    if(n < 0){
        System.out.println("invalid number");
        return;
}
int factorial = 1;
for(int i=n; i>=1; i--){
    factorial = factorial * i;
}
    System.out.println("factorial of the given number is : " + factorial);
    return;
}
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
   System.out.println("enter n : ");
   int n = sc.nextInt(); 
   FindFactorial(n);
}
    }

