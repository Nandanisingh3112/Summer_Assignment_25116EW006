import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Question3 {
//program to character frequency
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string : ");
    String input = sc.nextLine();
    Map<Character , Integer>frequencyMap = new HashMap<>();
    for(char ch : input.toCharArray()){
        frequencyMap.put(ch, frequencyMap.getOrDefault(ch , 0)+ 1);
    }
    System.out.println("character frequencies in '"+ input + "' : " );
    for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()){
        System.out.println("'" + entry.getKey() + " ' : " + entry.getValue());
    }
}
}
