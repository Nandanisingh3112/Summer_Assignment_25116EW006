import java.util.*;
public class Question4{
//write function for perfect number
public static boolean isPerfect(int n){
    if(n<=1){
      return false;
    }
    int sum = 1;
    for(int i=2; i*i<=n; i++){
        if(n % i == 0){
            sum +=i;
            if(i != n/i){
                sum += n/i;
            }
        }
    }
    return sum == n;
}
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n : ");
    int n = sc.nextInt();
    if(isPerfect(n)){
        System.out.println(n + " is a perfect number.");
    }else{
        System.out.println(n + " is not a perfect number.");
    }
} 
}
