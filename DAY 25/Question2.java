import java.util.Set;
import java.util.TreeSet;
public class Question2 {
//find common characters in string
public static void main(String[] args) {
    String str1 = "thin sticks";
    String str2 = "thick bricks";
    Set<Character> commonChars = findCommonChars(str1 , str2);
    System.out.println("string1 : "+ str1);
    System.out.println("String2 :"+ str2);
    System.out.println("common characters : "+ commonChars);
}
public static Set<Character> findCommonChars(String s1 , String s2){
    Set<Character> set1 = new TreeSet<>();
    Set<Character> set2 = new TreeSet<>();
    for(char c : s1.replace(" " ,"").toCharArray()){
        set2.add(c);
    }
    set1.retainAll(set2);
    return set1;
}
}
