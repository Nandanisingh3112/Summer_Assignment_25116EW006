import java.util.*;
public class Question1 {
    public static void main(String[]args){
    //generate Fibonacci series
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int n = sc.nextInt();
    int Fib1 = 0;
    int Fib2 = 1;
    System.out.println("Fibonacci series upto " + n + "terms :");
    for(int i=1; i<=n; i++){
        System.out.println(Fib1 + " ");
        int nextFib = Fib1 + Fib2;
        Fib1 = Fib2;
        Fib2 = nextFib;
    
    }
} 
}
