import java.util.Arrays;
public class Question1 {
//merge two sorted arrays
public static int[] merge(int[] arr1 , int[] arr2){
    int n = arr1.length;
    int m = arr2.length;
    int[] result = new int[n + m];
    int i = 0;
    int j = 0;
    int k = 0;
    while(i<n && j<m){
        if(arr1[i] <= arr2[j]){
            result[k++] = arr1[i++];
        }else{
            result[k++] = arr2[j++];
        }
    }
    while(i<n){
        result[k++] = arr1[i++];
    }
    while(j<m){
        result[k++] = arr2[j++];
    }
    return result;
}
public static void main(String[] args) {
    int[] arr1 = {1, 3, 5, 7};
    int[] arr2 = {2, 4, 6, 8, 9};
    int[] mergedArray = merge(arr1, arr2);
    System.out.println("merged array : "+ Arrays.toString(mergedArray));
}
    
}
