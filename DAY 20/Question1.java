import java.util.Scanner;
public class Question1 {
//matrix multiplication
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter rows and column for first matrix: ");
    int rows1 = sc.nextInt();
    int col1 = sc.nextInt();
    System.out.print("enter rows and column for second matrix: ");
    int rows2 = sc.nextInt();
    int col2 = sc.nextInt();
    if(col1 != rows2){
        System.out.println("error : column of first matrix must be equal to second matrix");
    }
    int[][]matrix1 = new int[rows1][col1];
    int[][]matrix2 = new int[rows2][col2];
    int[][]product = new int[rows1][col2];
    System.out.println("enter elements for first matrix: ");
    for(int i=0; i<rows1; i++){
        for(int j=0; j<col1; j++){
            matrix1[i][j] = sc.nextInt();
        }
    }
    System.out.println("enter elements for second matrix: ");
    for(int i=0; i<rows2; i++){
        for(int j=0; j<col2; j++){
            matrix2[i][j] = sc.nextInt();
        }
    }
    for(int i=0; i<rows1; i++){
        for(int j=0; j<col2; j++){
            for(int k=0; k<col1; k++){
            product[i][j] += matrix1[i][k]*matrix2[k][j];
        }
    }
}
System.out.println("resultant product matrix: ");
for(int i=0; i<rows1; i++){
        for(int j=0; j<col2; j++){
            System.out.print(product[i][j]+ " ");    
}
System.out.println();
}
}
}
