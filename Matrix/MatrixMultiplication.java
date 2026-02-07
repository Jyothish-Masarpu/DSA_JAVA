package Matrix;
import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows for first matrix: ");
        int rows1=sc.nextInt();
        System.out.print("Enter no. of cols for first matrix: ");
        int cols1=sc.nextInt();
        int[][] matrix1=new int[rows1][cols1];
        System.out.println("Enter first matrix elements: ");
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter no. of rows for second matrix: ");
        int rows2=sc.nextInt();
        System.out.print("Enter no. of cols for second matrix: ");
        int cols2=sc.nextInt();
        if(cols1!=rows2){
            System.out.println("Matrix multiplication is not possible");
            sc.close();
            return;   
        }
        int[][] matrix2=new int[rows2][cols2];
        System.out.println("Enter second matrix elements: ");
        for(int i=0;i<rows2;i++){
            for(int j=0;j<cols2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        sc.close();
        int[][] result=new int[rows1][cols2];
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols2;j++){
                result[i][j]=0;
                for(int k=0;k<cols1;k++){
                    result[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        System.out.println("Result of multiplication of two matrices: ");
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
