import java.util.*;
public class Question2 {
    public static void main(String[]args){
    //print prime numbers in a range
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Prime numbers upto " + n + " are: ");
    for(int i=2; i<=n; i++){
        int count = 0;
        for(int j=1; j<=i; j++){
        if(i%j==0){
            count++;
        }
    }if(count==2){
    System.out.println(i);
    }
} 
}
}