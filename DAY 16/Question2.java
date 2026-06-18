import java.util.HashMap;
import java.util.Map;
public class Question2 {
//program to find maximum frequency of element
public static int findMaxFrequency(int[] arr){
    if(arr == null || arr.length == 0){
        return 0;
    }
    Map<Integer , Integer>frequencyMap = new HashMap<>();
    int maxFrequency = 0;
    for(int num : arr){
        int currentFrequency = frequencyMap.getOrDefault(num , 0) + 1;
        frequencyMap.put(num, currentFrequency);
        if(currentFrequency>maxFrequency){
            maxFrequency = currentFrequency;
        }
    }
    return maxFrequency;
}
public static void main(String[]args){
    int[] numbers = {4, 1, 2, 2, 3, 2, 4, 4, 4, 5};
    int maxFreq = findMaxFrequency(numbers);
    System.out.println("maximum frequency of any element is : "+ maxFreq);

}
}
