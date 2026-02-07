package Matrix;
import java.util.Scanner;
public class EvenOddElements {
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
        int oc=0,ec=0;//count of odd and even
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if((matrix[i][j]&1)==1){
                    oc++;
                }
                else{
                    ec++;
                }
            }
        }
        System.out.println("Odd elements count in the matrix: "+oc);
        System.out.println("Even elements count in the matrix: "+ec);
    }
}
