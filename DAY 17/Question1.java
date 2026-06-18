import java.util.Arrays;
public class Question1 {
//merge arrays in java
public static void main(String[]args){
    int[] array1 = {1, 2, 3};
    int[] array2 = {4, 5, 6};
    int[] mergedArray = new int[array1.length + array2.length];
    int position = 0;
    for(int element : array1){
        mergedArray[position] = element;
        position++;
    }
    for(int element : array2){
        mergedArray[position] = element;
        position++;
    }
    System.out.println(Arrays.toString(mergedArray));
}    
}
