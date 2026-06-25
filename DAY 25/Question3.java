import java.util.Arrays;
public class Question3 {
//sort names alphabetically
public static void main(String[] args) {
    String[] names = {"rahul" , "ajay" , "gourav" , "amit"};
    Arrays.sort(names);
    System.out.println("names in alphabetical order : ");
    for(String name : names){
        System.out.println(name);
    }
}
}
    

