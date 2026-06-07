import java.util.*;
public class Question3{
//find recursive sum of digits
public static int SumOfDigit(int n){
    if(n == 0){
        return 0;
    }
    return(n%10) + SumOfDigit(n/10);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();
        int result = SumOfDigit(num);
        System.out.println("recursive sum of digits is : " + result);
    }
    }
