import java.util.Arrays;
import java.util.Comparator;
public class Question4 {
//sort words by length
public static void main(String[] args) {
    String[] words = {"apple" , "kiwi" , "banana", "litchi"};
    Arrays.sort(words , Comparator.comparingInt(String::length));
    System.out.println("ascending : "+ Arrays.toString(words));
}
}
