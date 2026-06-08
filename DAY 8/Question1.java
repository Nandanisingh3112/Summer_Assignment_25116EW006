import java.util.*;
public class Question1 {
    public static void main(String[]args){
    //print half pyramid pattern
    Scanner sc = new Scanner(System.in);
    System.out.println("enter rows : ");
    int rows = sc.nextInt();
    for(int i=1; i<=rows; i++){
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
    }
