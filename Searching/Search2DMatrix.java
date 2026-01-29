/*
Input: matrix=[[1,3,5,7],[10,11,16,20],[23,30,34,60]],target=3
Output: true 
*/
package Searching;
public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=2;
        boolean result=searchmatrix(matrix,target);
        System.out.println(result?"true":"false");
    }
    public static boolean searchmatrix(int[][] matrix,int target){
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0,right=m*n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int midval=matrix[mid/n][mid%n];
            if(midval==target) return true;
            else if(midval<target) left=mid+1;
            else right=mid-1;
        }
        return false;
    }
}
