import java.util.*;
public class Question3 {
//program to rotate array right
public static void main(String[]args){
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;
    System.out.println("original array : "+ Arrays.toString(arr));
    rotateRight(arr , k);
    System.out.println("rotated array : " + Arrays.toString(arr));
}
public static void rotateRight(int[] arr , int k){
    if(arr == null || arr.length <= 1){
        return;
    }
    int n = arr.length;
    k = k % n;
    reverse(arr , 0 , n-1);
    reverse(arr , 0 , k-1);
    reverse(arr , k , n-1);
}
private static void reverse(int[] arr , int start , int end){
    while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
}

