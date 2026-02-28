/*
LeetCode 896. Monotonic Array
reference: https://leetcode.com/problems/monotonic-array/description/
*/
public class MonotonicArray {
    public static void main(String[] args) {
        int[] arr={6,5,4,4};
        System.out.println("Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=1;i<arr.length;i++){
            if(arr[0]<arr[arr.length-1]){
                if(arr[i]<arr[i-1]){
                    System.out.println("Not Monotonic");
                    return;
                }
            }
            else{
                if(arr[i]>arr[i-1]){
                    System.out.println("Not Monotonic");
                    return;
                }
            }
        }
        System.out.println("Monotonic");
    }
}
