package Matrix;
import java.util.Scanner;
public class MaxMinInMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter no. of cols: ");
        int cols=sc.nextInt();
        int[][] matrix=new int[rows][cols];
        System.out.println("Enter matrix elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        }
        System.out.println("Maximum element in the matrix: "+max);
        System.out.println("Minimum element in the matrix: "+min);
    }
}
