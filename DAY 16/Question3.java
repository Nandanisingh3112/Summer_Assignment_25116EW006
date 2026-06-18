import java.util.HashSet;
public class Question3 {
    //find pair with given sum
    public static void findPair(int[] arr, int target){
        HashSet<Integer>seenNumbers = new HashSet<>();
        boolean pairFound = false;
        for(int num : arr){
            int complement = target - num;
            if(seenNumbers.contains(complement)){
                System.out.println("pair found : (" + complement + " ," + num + ")");
                pairFound = true;
                break;
            }
            seenNumbers.add(num);
        }
        if(!pairFound){
            System.out.println("no pair found with given sum");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, -1, 4};
        int target = 10;
        findPair(arr, target);
    }
}
