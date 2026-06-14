import java.util.HashMap;
import java.util.Map;
public class Question2 {
//program to frequency of an element
public static void main(String[]args){
    int[] numbers = {10, 5, 10, 15, 10, 65, 20};
    HashMap<Integer , Integer> frequencyMap = new HashMap<>();
    for(int num : numbers){
        frequencyMap.put(num , frequencyMap.getOrDefault(num , 0) + 1);
    }
    System.out.println("elements | frequency");
    System.out.println("--------------------");
    for(Map.Entry<Integer , Integer>entry : frequencyMap.entrySet()){
        System.out.println(entry.getKey() + "       | " + entry.getValue());
    }
}
}
