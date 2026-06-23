import java.util.*;
public class Question2 {
//first repeating character
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string : ");
    String input = sc.nextLine();
    char result = RepeatingChar(input);
    if(result != '\0'){
        System.out.println("the first repeating char is : "+ result);
    }else{
        System.out.println("no repeating character found.");
    }
}
public static char RepeatingChar(String str){
    HashSet<Character> seenCharacters = new HashSet<>();
    for(int i=0; i<str.length(); i++){
        char current_char = str.charAt(i);
        if(seenCharacters.contains(current_char)){
            return current_char;
        }
        seenCharacters.add(current_char);
    }
    return '\0';
}
}
