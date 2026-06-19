import java.util.Scanner;
public class Question4 {
//program to find diagonal sum of matrices
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of square matrix : ");
    int n = sc.nextInt();
    int[][] matrix = new int[n][n];
    System.out.println("enter the matrix elements : ");
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            matrix[i][j] = sc.nextInt();
        }
    }
    int principalSum = 0;
    int secondarySum = 0;
    int totalDiagonalSum = 0;
    for(int i=0; i<n; i++){
        principalSum += matrix[i][i];
        secondarySum += matrix[i][n-1-i];
        totalDiagonalSum += matrix[i][i];
        if(i != n-1-i){
            totalDiagonalSum += matrix[i][n-1-i];
        }
    }
    System.out.println("/n---results---");
    System.out.println("sum of principal diagonal : "+ principalSum);
    System.out.println("sum of secondary diagonal : "+ secondarySum);
    System.out.println("total combined diagonal sum (without double-counting) : "+ totalDiagonalSum);
}
}
