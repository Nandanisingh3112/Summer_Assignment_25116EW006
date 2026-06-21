import java.util.Scanner;
public class Question2 {
//check symmetric matrix
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of rows : ");
    int rows = sc.nextInt();
    System.out.println("enter the number of column: ");
    int col = sc.nextInt();
    if(rows != col){
        System.out.println("the matrix is not symmetric");
    }
    int[][] matrix = new int[rows][col];
    System.out.println("enter the elements of matrix: ");
    for(int i=0; i<rows; i++){
        for(int j=0; j<col; j++){
            matrix[i][j] = sc.nextInt();
        }
    }
    boolean isSymmetric = true;
    for(int i=0; i<rows; i++){
        for(int j=0; j<col; j++){
            if(matrix[i][j] != matrix[j][i]){
                isSymmetric = false;
                break;
            }
        }
        if(!isSymmetric){
            break;
        }
    }
        if(isSymmetric){
            System.out.println("the given matrix is symmteric matrix");
        }else{
            System.out.println("the given matrix is not symmteric matrix");
        }
    }
}

