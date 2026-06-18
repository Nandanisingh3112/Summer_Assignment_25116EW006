import java.util.HashSet;
public class Question4 {
//find common elements
public static void main(String[]args){
    int[] array1 = {1, 2, 3, 4, 5, 4};
    int[] array2 = {4, 5, 6, 7, 8, 4};
    System.out.println("common element using hashset :");
    findCommonElements(array1 , array2);
}
public static void findCommonElements(int[] arr1, int[] arr2){
    HashSet<Integer> set = new HashSet<>();
    HashSet<Integer> commonElements = new HashSet<>();
    for(int num : arr1){
        set.add(num);
    }
    for(int num : arr2){
        if(set.contains(num)){
            commonElements.add(num);
        }
    }
    System.out.println(commonElements);
}
}
