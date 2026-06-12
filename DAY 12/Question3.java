import java.util.*;
public class Question3 {
//write function for fibonacci number
public static void PrintFibonacci(int n){
    int fib1 = 0;
    int fib2 = 1;
    System.out.println("fibonacci series upto " + n + " terms : ");
    for(int i=1; i<=n; i++){
        System.out.print(fib1 + " ");
        int nextfib = fib1 + fib2;
        fib1 = fib2;
        fib2 = nextfib;
    }
}
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n : ");
    int n = sc.nextInt();
    PrintFibonacci(n);
}
}
