import java.util.*;
public class Question4 {
    public static void main(String[]args){
    // print character pyramid
    Scanner sc = new Scanner(System.in);
    System.out.println("enter rows : ");
    int rows = sc.nextInt();
    for(int i=1; i<=rows; i++){
        for(int j=1; j<=rows-i; j++){
            System.out.print(" ");
        }
        char ch = 'A';
        for(int j=1; j<=i; j++){
            System.out.print(ch++);
        }
        ch -= 2;
        for(int j=i-1; j>=1; j--){
            System.out.print(ch--);
        }
        System.out.println();
    }
}
}
