import java.util.*;
public class Question3{
    public static void main(String[]args){
    //print number pyramid
    Scanner sc = new Scanner(System.in);
    System.out.println("enter rows : ");
    int rows = sc.nextInt();
    for(int i=1; i<=rows; i++){
        for(int j=1; j<=rows-i; j++){
            System.out.print(" ");
        }
        for(int k=1; k<=i; k++){
            System.out.print(k);
        }
        for(int l=i-1; l>=1; l--){
            System.out.print(l);
        }
        System.out.println();
    }
    }
}
