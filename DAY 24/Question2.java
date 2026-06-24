import java.util.*;
public class Question2 {
//compress a string
public static String compress(String str){
    if(str == null || str.isEmpty()){
        return str;
    }
    StringBuilder compressed = new StringBuilder();
    int count = 1;
    for(int i=0; i<str.length(); i++){
        if(i+1 < str.length() && str.charAt(i) == str.charAt(i+1)){
            count++;
        }else{
            compressed.append(str.charAt(i));
            compressed.append(count);
            count = 1;
        }
    }
    return compressed.length() < str.length() ? compressed.toString() : str;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string 1 : ");
    String input1  = sc.nextLine();
    System.out.println("enter string 2 : ");
    String input2 = sc.nextLine();
    System.out.println("original : "+ input1 + "->compressed : "+ compress(input1));
    System.out.println("original : "+ input2 + "->compressed : "+ compress(input2));
}
}
