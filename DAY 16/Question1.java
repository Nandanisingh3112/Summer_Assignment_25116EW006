import java.util.*;
public class Question1 {
//PROGRAM TO FIND MISSING NUMBER IN AN ARRAY
public static int MissingNumber(int[] arr){
int n = arr.length + 1;
int expectedSum = n * (n + 1) / 2;
int actualSum = 0;
for(int num : arr){
    actualSum += num;
}
return expectedSum - actualSum;
}
public static void main(String[]args){
    int[] arr = {1, 2, 3, 4, 5, 6};
    System.out.println("missing number is "+ MissingNumber(arr));
}
}
