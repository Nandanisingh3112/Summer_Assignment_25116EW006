import java.util.*;
public class Question3 {
    public static void main(String[]args){
    //print factors of a number
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number : ");
    int n = sc.nextInt();       
    System.out.println("factors of this number are : ");
    for(int i=1; i<=n; i++){
        if(n%i == 0){
   System.out.println(i);
    }
}
}
}
    
  
