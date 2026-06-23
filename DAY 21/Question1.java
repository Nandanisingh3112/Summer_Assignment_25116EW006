import java.util.*;
public class Question1 {
//find string length without strlen()
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string : ");
    String str = sc.nextLine();
    int count = 0;
    for(char c : str.toCharArray()){
        count++;
    }
    System.out.println("the length of the string is : "+ count);
}
}
