import java.util.*;
public class Question1 {
//reverse an array
public static void main(String[]args){
    int[] arr = {10, 20, 30, 40, 50};
    System.out.println("original array : "+ Arrays.toString(arr));
    int start = 0;
    int end = arr.length - 1;
    while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    System.out.println("reverse array : "+ Arrays.toString(arr));
}
}
