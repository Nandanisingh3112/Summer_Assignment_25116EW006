import java.util.*;
public class Question2 {
    public static void main(String[]args){
    // check strong number
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    int original = n;
    int SumOfFactorial = 0;
    while (n>0){
        int digit = n%10;
        int fact = 1;
       for(int i=1; i<=digit; i++){
        fact = fact*i;
       }
        SumOfFactorial += fact;
        n = n/10;
    }
    if(original == SumOfFactorial){
        System.out.println("the number is strong number");
    }else{
        System.out.println("the number is not strong number");
    }
}
}

