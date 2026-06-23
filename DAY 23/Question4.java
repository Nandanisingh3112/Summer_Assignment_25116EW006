import java.util.*;
public class Question4 {
//find maximum occuring character
public static char MaxOccuringChar(String str){
    int[] count = new int[256];
    int length = str.length();
    for(int i=0; i<length; i++){
        count[str.charAt(i)]++;
    }
    int max = -1;
    char result = ' ';
    for(int i=0; i<length; i++){
        if(max < count[str.charAt(i)]){
            max = count[str.charAt(i)];
            result = str.charAt(i);
        }
    }
    return result;
}
public static void main(String[] args) {
    String input = "sample string";
    char maxChar = MaxOccuringChar(input);
    System.out.println("input string : "+ input);
    System.out.println("maximum occuring char is : " + maxChar);
}
}
