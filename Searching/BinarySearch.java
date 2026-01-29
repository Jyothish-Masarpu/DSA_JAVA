package Searching;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={5,7,9,11,12,33,77};
        int target=9;
        int result=binarysearch(arr,target);
        if(result!=-1){
            System.out.println("Element found at "+result+" index");
        }
        else{
            System.out.println("Element Not found");
        }
    }
    public static int binarysearch(int[] arr,int target){
        int steps=0;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            steps++;
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                System.out.println("Steps taken: "+steps);
                return mid;
            }
            else if(arr[mid]<target)
               left=mid+1;
            else
                right=mid-1;
        }
        System.out.println("Steps taken: "+steps);
        return -1;
    }
}
