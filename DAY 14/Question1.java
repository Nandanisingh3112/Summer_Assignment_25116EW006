import java.util.*;
public class Question1 {
//program to linear search
public static int LinearSearch(int[]arr , int target){
    for(int i=0; i<arr.length; i++){
        if(arr[i] == target){
            return i;
        }
    }
    return -1;
}
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int[] numbers = {12, 45, 7, 9, 23, 56, 34};
    System.out.println("enter targetValue : ");
    int targetValue = sc.nextInt();
    int resultIndex =  LinearSearch(numbers , targetValue);
    if(resultIndex != -1){
        System.out.println("element "+ targetValue + " found at index : "+ resultIndex);
    }else{
        System.out.println("element "+ targetValue + " not found in the array.");
    }
}
}
