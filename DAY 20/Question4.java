import java.util.Scanner;
public class Question4 {
//find column wise sum
public static void main(String[] args) {
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
    };
    int rows = matrix.length;
    int col = matrix[0].length;
    System.out.println("calculating column wise sum : ");
    for(int j=0; j<col; j++){
        int colSum = 0;
        for(int i=0; i<rows; i++){
            colSum += matrix[i][j];
        }
        System.out.println("sum of column "+(j + 1) + " : " + colSum);
    }
}
}
    

