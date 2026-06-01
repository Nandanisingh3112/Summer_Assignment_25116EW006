import java.util.*;
public class Question3 {
    public static void main(String[]args){
    //factorial of a number
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fact = 1;
    for(int i=n; i>=1; i--){
        fact = fact * i;
    }System.out.println(fact);
    }
    }
