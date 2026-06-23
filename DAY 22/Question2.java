import java.util.*;
public class Question2 {
//count words in a sentence
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a sentence : ");
    String sentence = sc.nextLine();
    int WordCount = CountWords(sentence);
    System.out.println("total word count : "+ WordCount);
}
public static int CountWords(String str){
    if(str == null || str.trim().isEmpty()){
        return 0;
    }
    String[] words = str.trim().split("\\s+");
    return words.length;
}
}
