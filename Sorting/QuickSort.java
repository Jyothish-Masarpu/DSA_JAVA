package Sorting;
public class QuickSort {
    static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pivotindex=partition(arr, low, high);
            quicksort(arr, low, pivotindex-1);
            quicksort(arr, pivotindex+1, high);
        }
    }
    static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr={38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        quicksort(arr,0,arr.length-1);
        System.out.println("Sorted Array: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
