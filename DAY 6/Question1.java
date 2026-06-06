import java.util.*;
public class Question1 {
    public static void main(String[]args){
    //convert decimal to binary
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a decimal number : ");
    int n = sc.nextInt();
    StringBuilder binary = new StringBuilder();
    if(n == 0){
        binary.append("0");
    }else{
        while(n>0){
            int i = n % 2;
            binary.insert(0 , i);
            n = n/2;
        }
    }
    System.out.println("binary number is : " + binary.toString());
    }
}
