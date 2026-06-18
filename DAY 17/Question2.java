import java.util.Arrays;
import java.util.HashSet;
public class Question2 {
//union of arrays
public static void main(String[] args) {
    int[] array1 = {1, 3, 2, 4, 8, 2};
    int[] array2 = {2, 4, 5, 6, 8, 10, 5};
    HashSet<Integer> set = new HashSet<>();
    for(int num : array1){
        set.add(num);
    }
    for(int num : array2){
        set.add(num);
    }
    int[] unionArray = new int[set.size()];
    int index = 0;
    for(int num : set){
        unionArray[index++] = num;
    } System.out.println("union of arrays : "+ Arrays.toString(unionArray));
}
}
