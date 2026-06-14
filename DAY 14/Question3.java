import java.util.*;
public class Question3 {
//program to second largest element
public static void main(String[]args){
int[] numbers = {12, 35, 1, 10, 34, 1, 35};
int result = findSecondLargest(numbers);
if(result == Integer.MIN_VALUE){
    System.out.println("No valid second largest element found.");
}else{
    System.out.println("the second largest number is : "+ result);
}
}
public static int findSecondLargest(int[] arr){
    if(arr == null || arr.length<2){
        return Integer.MIN_VALUE;
    }
    int largest = Integer.MIN_VALUE;
    int SecondLargest = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>largest){
        SecondLargest = largest;
        largest = arr[i]; 
        }
        else if(arr[i]> SecondLargest && arr[i] != largest){
         SecondLargest = arr[i];    
        }
    }
    return SecondLargest;
}
}
