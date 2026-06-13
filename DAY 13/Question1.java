import java.util.*;
public class Question1{
//program to input and display an array
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the size of an array : ");
    int size = sc.nextInt();
    int[] numbers = new int[size];
    System.out.println("enter " + size + " elements :");
    for(int i=0; i<size; i++){
        System.out.print("element at index " + i + " :");
        numbers[i] = sc.nextInt();
    }
    System.out.println("the elements in your array are : ");
    for(int i=0; i<numbers.length; i++){
        System.out.print(numbers[i] + " ");
    }
}
}
