//Print a 2D Array
import java.util.*;
public class Array2D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter no. of columns: ");
        int cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        System.out.println("Enter elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The 2D Array is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
