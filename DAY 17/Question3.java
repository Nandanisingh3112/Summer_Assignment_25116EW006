import java.util.HashSet;
import java.util.Arrays;
public class Question3 {
//intersection of arrays
public static int[] findIntersection(int[] nums1, int[] nums2){
    HashSet<Integer> set = new HashSet<>();
    HashSet<Integer> intersectionSet = new HashSet<>();
    for(int  num : nums1){
        set.add(num);
    }
    for(int num : nums2){
        if(set.contains(num)){
            intersectionSet.add(num);
        }
    }
    int[] result = new int[intersectionSet.size()];
    int index = 0;
    for(int num : intersectionSet){
        result[index++] = num;
    }
    return result;
}
public static void main(String[]args){
    int[] array1 = {4, 9, 5, 4};
    int[] array2 = {9, 4, 9, 8, 4};
    int[] result = findIntersection(array1, array2);
    System.out.println("Intersection(uniques : "+ Arrays.toString(result));
}
}
