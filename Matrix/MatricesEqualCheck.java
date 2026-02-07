package Matrix;
import java.util.*;
public class MatricesEqualCheck {
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
        boolean areEqual=true;
        outer:
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix1[i][j]!=matrix2[i][j]){
                    areEqual=false;
                    break outer;
                }
            }
        }
        if(areEqual){
            System.out.println("The matrices are equal.");
        }else{
            System.out.println("The matrices are not equal.");
        }
    }
}
