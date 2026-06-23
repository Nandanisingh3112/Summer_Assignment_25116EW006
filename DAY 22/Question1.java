import java.util.*;
public class Question1 {
//check palindrome string
public static boolean isPalindrome(String str){
    String reversed = new StringBuilder(str).reverse().toString();
    return str.equalsIgnoreCase(reversed);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string : ");
    String input = sc.nextLine();
    if(isPalindrome(input)){
        System.out.println("\"" + input + "\"is a palindrome.");
    }else{
        System.out.println("\"" + input +"\"is not a palindrome.");
    }

}
}
