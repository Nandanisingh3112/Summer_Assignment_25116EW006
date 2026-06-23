import java.util.*;
public class Question1 {
    //first non-repeating character
    public static char NonRepeatingChar(String str){
        int[] charCounts = new int[256];
        for(int i=0; i<str.length(); i++){
            charCounts[str.charAt(i)]++;        }
    for(int i=0; i<str.length(); i++){
        if(charCounts[str.charAt(i)] == 1){
            return str.charAt(i);
        }
    }
    return '_';
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string : ");
    String input = sc.nextLine();
    char result = NonRepeatingChar(input);
    if(result != '_'){
        System.out.println("the first non repeating character is : "+ result);
    }else{
        System.out.println("all characters are repeating.");
    }
}
}
