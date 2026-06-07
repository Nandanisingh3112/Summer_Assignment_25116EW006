import java.util.*;
public class Question4 {
//find recursive reverse number
public static int reverse(int n , int rev){
    if(n==0){
        return rev;
    }
rev = (rev * 10) + (n % 10);
return reverse(n/10 , rev);
}
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number : ");
    int n = sc.nextInt();
    int result = reverse(n , 0);
    System.out.println("reversed number : " + result);
    }
    }
