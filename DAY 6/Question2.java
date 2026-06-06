import java.util.*;
public class Question2 {
    public static void main(String[]args){
    //binary to decimal
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a binary number : ");
    String binary = sc.next();
    int decimal = 0;
    int power  = 0;
    for(int i=binary.length()-1; i>=0; i--){
        char bit = binary.charAt(i);
        if(bit == '1'){
          decimal += Math.pow(2 , power);
        }else if(bit!='0'){
            System.out.println("invalid binary string");
            return;
        }
        power++;
    }
        System.out.println("decimal : "+ decimal);
    } 
}
    

