import java.util.*;
public class Question2{
    public static void main(String[]args){
    //print reverse star pyramid
    Scanner sc = new Scanner(System.in);
    System.out.println("enter rows : ");
    int rows = sc.nextInt();
    for(int i=rows; i>=1; i--){
        for(int j=1; j<=rows-i; j++){
            System.out.print(" ");
        }
        for(int k=1; k<=2*i-1; k++){
        System.out.print("*");
    }
    System.out.println();
    }
}
}
