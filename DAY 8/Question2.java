import java.util.*;
public class Question2 {
    public static void main(String[]args){
    //print number triangle
    Scanner sc = new Scanner(System.in);
    System.out.println("enter rows : ");
    int rows = sc.nextInt();
    for(int i=1; i<=rows; i++){
        for(int j=1; j<=i; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }
    }
    }
