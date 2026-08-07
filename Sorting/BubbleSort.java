package Sorting;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int n=arr.length;
        System.out.println("Original array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    // swap arr[j] and arr[j+1]
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        // Print the sorted array
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
