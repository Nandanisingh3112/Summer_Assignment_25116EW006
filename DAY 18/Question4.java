import java.util.Arrays;
public class Question4 {
//sort array in descending order
public static void main(String[]args){
    int[] arr = {5, 2, 9, 1, 3};
    int temp;
    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i] < arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    System.out.println("descending order: "+ Arrays.toString(arr));
}
}
