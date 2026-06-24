import java.util.*;
public class Question3 {
//program to find longest word
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a sentence : ");
    String sentence = sc.nextLine();
    String[] words = sentence.split(" ");
    String longestWord = "";
    for(String word : words){
        if(word.length() > longestWord.length()){
            longestWord = word;
        }
    }
    System.out.println("longest word : " + longestWord);
    System.out.println("length : "+ longestWord.length());
}
}
