import java.util.*;
public class Question4 {
    public static void main(String[]args){
    //print armstrong numbers in a range
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int n = sc.nextInt();
    System.out.println("Armstrong number between 1 and " + n + "=");
    for(int i=1; i<=n; i++){
    int original = i;
    int temp = i;
    int armstrong = 0;
    int digits = String.valueOf(temp).length();
    while(temp!=0){
    int digit = temp%10;
    armstrong += Math.pow(digit,digits);
    temp = temp/10;
    }
    if(armstrong==original){
    System.out.println(original);
} 
    }
}
}
