import java.util.Arrays;
public class Question4 {
//remove duplicates from array
    public static void main(String[]args){
        int[] arr = {4, 5, 4, 2, 2, 3, 1};
        Arrays.sort(arr);
        int uniqueCount = removeDuplicates(arr);
        int[] uniqueArray = Arrays.copyOf(arr, uniqueCount);
        System.out.println("unique array: " + Arrays.toString(uniqueArray));
    }
    public static int removeDuplicates(int[] arr){
        if(arr.length == 0 || arr.length == 1)
            return arr.length;
            int j=0;
            for(int i=0; i<arr.length-1; i++){
                if(arr[i] != arr[i+1]){
                    arr[j++] = arr[i];
                }
            }
            arr[j++] = arr[arr.length - 1];
            return j;
        }
    }

