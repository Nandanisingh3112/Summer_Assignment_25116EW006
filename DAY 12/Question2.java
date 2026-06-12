import java.util.*;
public class Question2{
//write function for armstrong number
public static boolean isArmstrong(int n){
    int original = n;
    int digits = 0;
    int sum = 0;
    int temp = n;
    while(temp>0){
        temp /= 10;
        digits++;
    }
    temp = n;
    while(temp>0){
        int remainder = temp % 10;
        sum += Math.pow(remainder , digits);
        temp /= 10;
    }
    return sum == original;
}  
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n : ");
    int n = sc.nextInt();
    if(isArmstrong(n)){
        System.out.println(n + " is an armstrong number.");
    }else{
        System.out.println(n + " is not an armstrong number.");
    }
} 
}
