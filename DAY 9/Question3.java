import java.util.*;
public class Question3{
    public static void main(String[]args){
    //print repeated character pattern
    Scanner sc = new Scanner(System.in);
    System.out.println("enter rows : ");
    int rows = sc.nextInt();
    for(int i=0; i<rows; i++){
        char ch = (char) ('A' + i);
        for(int j=0; j<=i; j++){
            System.out.print(ch + " ");
        }
        System.out.println();
    }
    }
}
