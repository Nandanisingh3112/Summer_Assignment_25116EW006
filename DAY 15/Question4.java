import java.util.*;
public class Question4 {
//program to move zeroes to end
public static void moveZeroesToEnd(int[] arr){
    int nonZeroPointer = 0;
    for(int i=0; i<arr.length; i++){
        if(arr[i] != 0){
            arr[nonZeroPointer] = arr[i];
            nonZeroPointer++;
        }
    }
    while(nonZeroPointer < arr.length){
        arr[nonZeroPointer] = 0;
        nonZeroPointer++;
    }
}
public static void main(String[]args){
    int[] arr = {1, 0, 2, 0, 3, 0, 4, 12};
    System.out.println("original array : "+ Arrays.toString(arr));
    moveZeroesToEnd(arr);
    System.out.println("modified array : "+ Arrays.toString(arr));
}
}
