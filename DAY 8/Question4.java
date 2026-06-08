import java.util.*;
public class Question4 {
    public static void main(String[]args){
    //print repeated number pattern
    Scanner sc = new Scanner(System.in);
    System.out.println("enter rows : ");
    int rows = sc.nextInt();
    for(int i=1; i<=rows; i++){
        for(int j=1; j<=i; j++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
}
