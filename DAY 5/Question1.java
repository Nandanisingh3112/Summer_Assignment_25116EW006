import java.util.*;
public class Question1 {
    public static void main(String[]args){
    // check perfect number
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for(int i=1; i<=n/2; i++){
        if(n%i==0){
        sum += i;
    }
}
    if(n==sum){
        System.out.println("the number is perfect number ");
    }else{
        System.out.println("the number is not a perfect number ");
    }
    }
}
