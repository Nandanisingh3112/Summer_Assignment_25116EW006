import java.util.Scanner;
public class Question3 {
//find row wise sum
public static void main(String[] args) {
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
    };
    int rows = matrix.length;
    int col = matrix[0].length;
    System.out.println("calculating row wise sum : ");
    for(int i=0; i<rows; i++){
        int rowSum = 0;
        for(int j=0; j<col; j++){
            rowSum += matrix[i][j];
        }
        System.out.println("sum of row "+(i + 1)+ " = "+ rowSum);
    }
}
}
