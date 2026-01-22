import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows=sc.nextInt();
        sc.close();
        List<List<Integer>> triangle=new ArrayList<>();
        for(int i=0;i<rows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                } else {
                    int val=triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j);
                    row.add(val);
                }
            }
            triangle.add(row);
        }
        System.out.println("Pascal's Triangle:");
        for(List<Integer> row:triangle){
            for(int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
