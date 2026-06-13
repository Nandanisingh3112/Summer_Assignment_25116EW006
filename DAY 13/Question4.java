import java.util.*;
public class Question4{
//count even and odd elements in array
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("enter size of an array : ");
int size = sc.nextInt();
int[] numbers = new int[size];
    System.out.println("enter "+ size + " elements : " );
    for(int i=0; i<numbers.length; i++){
        numbers[i] = sc.nextInt();    
}
int evenCount = 0;
int oddCount = 0;
for(int i=0; i<numbers.length; i++){
    if(numbers[i]%2==0){
        evenCount++;
    }else{
        oddCount++;
    }
}
System.out.println("total even elements :" + evenCount);
System.out.println("total odd elements : " + oddCount);
}
}