import java.util.*;
public class Question4 {
//program to find duplicates in array
public static void main(String[]args){
    int[] numbers = {2, 4, 6, 8, 4, 6, 10, 10, 4};
    HashSet<Integer>uniqueElements = new HashSet<>();
    HashSet<Integer>duplicatesFound = new HashSet<>();
    System.out.println("duplicate elements : ");
    for(int num : numbers){
        if(!uniqueElements.add(num)){
            if(duplicatesFound.add(num)){
                System.out.print(num + " ");
            }
        }
    }
}
}
