import java.util.*;
public class Question4 {
    public static void main(String[]args){
    //find x^n without pow()
    Scanner sc = new Scanner(System.in);
    System.out.println("enter base x : ");
    int x = sc.nextInt();
    System.out.println("enter exponent n : ");
    int n = sc.nextInt();
    int result = 1;
    for(int i=0; i<n; i++){
        result *= x;
    }
    System.out.println("result = " + result);
    }
    }

