import java.util.*;
public class Question4 {
    public static void main(String[]args){
    //find largest prime factor
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number : ");
    int n = sc.nextInt();
    int largestFactor = 1;
    for(int i=2; i<n; i++){
        if(n%i==0){
            largestFactor = i;
            n = n/i;
        }
    }
    System.out.println("largest prime factor is : " + largestFactor);
    }
}

    

