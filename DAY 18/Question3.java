import java.util.*;
public class Question3 {
//binary search
public static int binarySearch(int[] arr, int target){
    int low = 0;
    int high = arr.length-1;
    while(low <= high){
        int mid = low + (high - low)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            low = mid + 1;
        }else{
            high = mid - 1;
        }
    }
    return - 1;
}
public static void main(String[] args) {
    int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
    int target = 23;
    int result = binarySearch(arr, target);
    if(result == -1){
        System.out.println("element "+ target + "is not present in array");
    }else{
        System.out.println("element "+ target + " found at index: "+ result);
    }
}
}
    

