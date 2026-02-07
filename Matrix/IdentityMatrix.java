package Matrix;
import java.util.Scanner;
public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter no. of cols: ");
        int cols=sc.nextInt();
        if(rows!=cols){
            System.out.println("The given matrix is not a square matrix.");
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
        boolean id=true;
        outer:
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==j){
                    if(matrix[i][j]!=1){
                        id=false;
                        break outer;
                    }
                }
                else{
                    if(matrix[i][j]!=0){
                        id=false;
                        break outer;
                    }
                }
            }
        }
        if(id){
            System.out.println("The given matrix is an identity matrix.");
        }
        else{
            System.out.println("The given matrix is not an identity matrix.");
        }
    }
}
