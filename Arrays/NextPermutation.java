/*
A permutation of an array of integers is an arrangement of its members
into a sequence or linear order.
For example, for arr = [1,2,3], the following are all the permutations 
of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
For example, the next permutation of arr = [1,2,3] is [1,3,2].
*/
import java.util.*;
public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int i=n-2;
        while(i>=0 && arr[i]>arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int [] arr,int l,int r){
        while(l<r){
            swap(arr,l,r);
            l++;
            r--;
        }
    }
}
