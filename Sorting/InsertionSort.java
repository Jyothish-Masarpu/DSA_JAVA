package Sorting;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={14,9,15,12,6,8,13};
        int n=arr.length;
        System.out.println("Original array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
        System.out.println("Sorted array: ");
        for(int i=0;i<n;++i){
            System.out.print(arr[i]+" ");
        }
    }
    private static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
