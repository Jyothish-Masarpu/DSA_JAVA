/*
Same for subtraction of matrix
*/
package Matrix;
import java.util.*;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter no. of cols: ");
        int cols=sc.nextInt();
        int[][] matrix1=new int[rows][cols];
        int[][] matrix2=new int[rows][cols];
        System.out.println("Enter first matrix elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second matrix elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        sc.close();
        int[][] result=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
                //for subtraction,change the operator accordingly
            }
        }
        System.out.println("Result of addition of two matrices: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
