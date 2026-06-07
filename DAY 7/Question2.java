import java.util.*;
public class Question2 {
//find recursive fibonacci
public static int fib(int n){
    if(n<=1){
        return n;
    }
    return fib(n-1) + fib(n-2);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("fibonacci number at position " + n + " is : " + fib(n));
        System.out.println("fibonacci series upto " + n + " terms : ");
        for(int i=0; i<n; i++){
            System.out.print(fib(i) + " ");
        }
    }
}
