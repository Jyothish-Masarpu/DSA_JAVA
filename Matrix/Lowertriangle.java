package Matrix;
import java.util.Scanner;
public class Lowertriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter no. of cols: ");
        int cols=sc.nextInt();
        if(rows!=cols){
            System.out.println("Lower triangular matrix is not possible in a non-square matrix.");
            sc.close();
            return;
        }
        int[][] matrix=new int[rows][cols];
        System.out.println("Enter matrix elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Lower triangle matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(j<=i){
                    System.out.print(matrix[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
