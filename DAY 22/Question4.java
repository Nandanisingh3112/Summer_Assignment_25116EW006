import java.util.*;
public class Question4 {
//remove spaces from string
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a sentence : ");
    String sentence = sc.nextLine();
    StringBuilder result = new StringBuilder();
    for(int i=0; i<sentence.length(); i++){
        char ch = sentence.charAt(i);
        if(ch != ' ' && ch != '\t'){
            result.append(ch);
        }
    }
    System.out.println("modified : " + result.toString());
}
}
