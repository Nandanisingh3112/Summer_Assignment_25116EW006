import java.util.*;
public class Question1 {
    public static void main(String[]args){
    //check whether a number is prime or not
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    int count = 0;
    for(int i=1; i<=n; i++){
        if(n%i==0){
            count++;
        }
    }
    if(count==2){
        System.out.println("The number is prime number");
    }else{
        System.out.println("The number is not a prime number");
    }
    }
    }
