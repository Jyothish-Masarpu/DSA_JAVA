package Matrix;
import java.util.Scanner;
public class PrintDiagonals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter no. of cols: ");
        int cols=sc.nextInt();
        if(rows!=cols){
            System.out.println("Diagonal elements are not possible in a non-square matrix.");
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
        System.out.println("Diagonal elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==j){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
}
