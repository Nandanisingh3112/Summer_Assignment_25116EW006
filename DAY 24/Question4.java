import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;
public class Question4 {
//program to remove duplicate characters
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string : ");
    String input = sc.nextLine();
    String result = removeDuplicateChars(input);
    System.out.println("original string : "+ input);
    System.out.println("string after removing duplicates : "+ result);
}
public static String removeDuplicateChars(String str){
    Set<Character> set = new LinkedHashSet<>();
    for(int i=0; i<str.length(); i++){
        set.add(str.charAt(i));
    }
    StringBuilder sb = new StringBuilder();
    for(Character ch : set){
       sb.append(ch);
    }
    return sb.toString();
}
}
