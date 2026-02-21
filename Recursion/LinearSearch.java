package Recursion;
public class LinearSearch {
    static void search(int[] arr,int key,int index){
        if(index==arr.length){
            System.out.println(key+" not found in the array.");
            return;
        }
        if(arr[index]==key){
            System.out.println(key+" found at index: "+index);
            return;
        }
        search(arr, key, index+1);
    }
    public static void main(String[] args) {
        int[] arr={1,5,2,3,10,8,6,7};
        search(arr,10,0);
    }
}
