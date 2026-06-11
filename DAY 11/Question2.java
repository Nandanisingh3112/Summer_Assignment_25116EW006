import java.util.*;
public class Question2 {
    public static int FindMax(int a, int b){
    //write function to find maximum
    if(a > b){
        return a;
    }
    else{
        return b;
    }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        int max = FindMax(a , b);
        System.out.println("the maximum number is : " + max);
    }
}
