import java.util.*;
public class Question1 {
 public static void main(String[]args){
    //sum of first n natural numbers
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for(int i=1; i<=n; i++){
        sum = sum + i;
    }System.out.println(sum);
 }   
}
