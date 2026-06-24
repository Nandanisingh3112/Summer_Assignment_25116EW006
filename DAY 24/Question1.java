import java.util.*;
public class Question1 {
//check string rotation
    public static boolean isRotation(String str1, String str2){
        if(str1 == null || str2 == null){
            return false;
        }
        if(str1.length() != str2.length()){
            return false;
        }
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string 1: ");
        String s1 = sc.nextLine();
         System.out.println("enter string 2: ");
        String s2 = sc.nextLine();
         System.out.println("enter string 3: ");
        String s3 = sc.nextLine();
        System.out.println("Is ' "+ s2 + " ' a rotation of '"+ s1 + " '? " + isRotation(s1, s2));
        System.out.println("Is ' "+ s3 + " ' a rotation of '"+ s1 + " '? " + isRotation(s1, s3));
        
    }
}
