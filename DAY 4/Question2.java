import java.util.*;
public class Question2 {
    public static void main(String[]args){
    //find nth Fibonacci term
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int n = sc.nextInt();
    int fib1 = 0;
    int fib2 = 1;
    if(n==0){
        System.out.println("The 0 Fibonacci term is " + fib1);
    }else if(n==1){
        System.out.println("The 1 Fibonacci term is " + fib2);
    }else{
    System.out.println("The " + n + " Fibonacci term is :");
    for(int i=2; i<=n; i++){
        int nextfib = fib1 + fib2;
        fib1 = fib2;
        fib2 = nextfib;
    }
    System.out.println(fib2);
    }
}
}
