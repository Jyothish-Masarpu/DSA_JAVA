package Sorting;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        int n=arr.length;
        System.out.println("Original array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<=n-1;i++){
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]) min=j;
            }
            swap(arr,i,min);
        }
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
