import java.util.*;
class SetMatrixZeroes{
    public static void main(String[] args) {
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
        sc.close();
        boolean frowzero=false;
        boolean fcolzero=false;
        for(int j=0;j<cols;j++){
            if(arr[0][j]==0){
                frowzero=true;
                break;
            }
        }
        for(int i=0;i<rows;i++){
            if(arr[i][0]==0){
                fcolzero=true;
                break;
            }
        }
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }
        if(frowzero){
            for(int j=0;j<cols;j++){
                arr[0][j]=0;
            }
        }
        if(fcolzero){
            for(int i=0;i<rows;i++){
                arr[i][0]=0;
            }
        }
        System.out.println("The modified Matrix is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}