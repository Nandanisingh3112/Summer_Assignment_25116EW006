import java.util.*;
public class Question3 {
    public static void main(String[]args){
    //count set bits in a number
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number : ");
    int n = sc.nextInt();
    int count = Integer.bitCount(n);
    System.out.println("set bit : "+ count);
    }
}
