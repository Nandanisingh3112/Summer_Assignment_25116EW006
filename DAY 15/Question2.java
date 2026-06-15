import java.util.*;
public class Question2 {
//program to rotate array left
public static void main(String[]args){
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int d = 3;
    System.out.println("original array : "+ Arrays.toString(arr));
    leftRotate(arr , d);
    System.out.println("left rotated array by "+ d + " positions : "+ Arrays.toString(arr));
}
public static void leftRotate(int[] arr, int d){
    if(arr == null || arr.length == 0)
        return;
    int n = arr.length;
    d = d % n;
    reverse(arr , 0 , d-1);
    reverse(arr , d , n-1);
    reverse(arr , 0 , n-1);
}
private static void reverse(int[] arr, int start, int end){
    while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
}
