package Matrix;
import java.util.*;
public class TotalDiagonalsSum {
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
        int primarysum=0,secondarysum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==j){
                    primarysum+=matrix[i][j];
                }
                if(i+j==cols-1){
                    secondarysum+=matrix[i][j];
                }
            }
        }
        System.out.println("Primary diagonal sum: "+primarysum);
        System.out.println("Secondary diagonal sum: "+secondarysum);
        System.out.println("Total diagonal sum: "+(primarysum+secondarysum));
    }
}
