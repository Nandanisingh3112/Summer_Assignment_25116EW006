import java.util.*;
public class Question3 {
//count vowel and consonants in a string
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string: ");
    String input = sc.nextLine();
    int vowelCount = 0;
    int consonantCount = 0;
    String lowerInput = input.toLowerCase();
    for(int i=0; i<lowerInput.length(); i++){
        char ch = lowerInput.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            vowelCount++;
        }
        else{
            consonantCount++;
        }
    }
    System.out.println("number of vowels : "+ vowelCount);
    System.out.println("number of consonants : "+ consonantCount);
    }
}
