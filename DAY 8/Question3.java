import java.util.*;
public class Question3 {
    public static void main(String[]args){
    //print character triangle
    Scanner sc = new Scanner(System.in);
    System.out.println("enter rows : ");
    int rows = sc.nextInt();
    for(int i=1; i<=rows; i++){
        char ch = 'A';
    for(int j=1; j<=i; j++){
        System.out.print(ch++ + " ");
    } 
    System.out.println();
   }
    }
    }
