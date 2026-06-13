import java.util.*;
public class Question2 {
//find sum and average of an array
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array : ");
    int size = sc.nextInt();
    int[] numbers = new int[size]; 
    System.out.println("enter "+ size + " elements : " );
    for(int i=0; i<numbers.length; i++){
        numbers[i] = sc.nextInt();
    }
    int sum = 0;
    System.out.println("the elements in array are : ");
    for(int i=0; i<numbers.length; i++){
        System.out.print(numbers[i] + " ");
        sum += numbers[i];
    }  
    double average = (double)sum / numbers.length;
    System.out.println("sum of array : " + sum);
    System.out.println("average of array : " + average);  
}
}   

