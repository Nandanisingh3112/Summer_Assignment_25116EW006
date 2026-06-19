import java.util.Scanner;
public class Question2 {
//program to subtract matrix
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number of rows :");
    int rows = sc.nextInt();
    System.out.print("enter the number of columns :");
    int column = sc.nextInt();
    int[][] matrix1 = new int[rows][column];
    int[][] matrix2 = new int[rows][column];
    int[][] resultMatrix = new int[rows][column];
    System.out.println("enter elements for matrix1 :");
    for(int i=0; i<rows; i++){
        for(int j=0; j<column; j++){
            matrix1[i][j] = sc.nextInt(); 
        }
    }
    System.out.println("enter elements for matrix2 :");
    for(int i=0; i<rows; i++){
        for(int j=0; j<column; j++){
            matrix2[i][j] = sc.nextInt();
        }
    }
    for(int i=0; i<rows; i++){
        for(int j=0; j<column; j++){
            resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
        }
    }
    System.out.println("resultant matrix after subtraction is :");
    for(int i=0; i<rows; i++){
        for(int j=0; j<column; j++){
            System.out.print(resultMatrix[i][j]+ "\t");
        }
        System.out.println();
    }
}
}

    

    

