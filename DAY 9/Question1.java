import java.util.*;
public class Question1 {
    public static void main(String[]args){
    //print reverse star pattern
    Scanner sc = new Scanner(System.in);
    System.out.println("enter rows : ");
    int rows = sc.nextInt();
    for(int i=rows; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    }

