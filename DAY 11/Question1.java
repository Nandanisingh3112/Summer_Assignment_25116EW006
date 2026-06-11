import java.util.*;
public class Question1 {
    public static int FindSum(int a, int b){
    //write function to find sum of two numbers
    return a + b;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        int sum = FindSum(a , b);
        System.out.println("the sum of " + a + " and " + b + " is : " + sum);
    }
}
