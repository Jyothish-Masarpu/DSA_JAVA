package Matrix;
import java.util.Scanner;
public class SumOfEachColumn {
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
        for(int i=0;i<cols;i++){
            int sum=0;
            for(int j=0;j<rows;j++){
                sum+=matrix[j][i];
            }
            System.out.println("Column "+i+" Sum: "+sum);
        }
    }
}
