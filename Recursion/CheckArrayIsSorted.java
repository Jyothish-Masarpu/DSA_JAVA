package Recursion;
public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] arr={1,3,5,7};
        System.out.println("Is Array Sorted: "+Sort(arr,0));
    }
    static boolean Sort(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return Sort(arr, i+1);
    }
}
