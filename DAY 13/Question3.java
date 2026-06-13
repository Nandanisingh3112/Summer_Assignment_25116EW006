import java.util.*;
public class Question3{
//find largest and smallest elements
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("enter size of an array : ");
int size = sc.nextInt();
int[] numbers = new int[size];
    System.out.println("enter "+ size + " elements : " );
    for(int i=0; i<numbers.length; i++){
        numbers[i] = sc.nextInt();
    }
        int max = numbers[0];
        int min = numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(numbers[i]>max){
            max = numbers[i];
            }
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("largest number is "+ max);
        System.out.println("smallest number is "+ min);
    }
}
