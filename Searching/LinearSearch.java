package Searching;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={5,9,11,7,12,3,77,12};
        int target=100;
        int result=linearsearch(arr,target);
        if(result!=-1){
            System.out.println("Element found at "+result+" index");
        }
        else{
            System.out.println("Element Not found");
        }
    }
    public static int linearsearch(int[] arr,int target){
        int steps=0;
        for(int i=0;i<arr.length;i++){
            steps++;
            if(arr[i]==target){
                System.out.println("Steps taken: "+steps);
                return i;
            }
        }
        System.out.println("Steps taken: "+steps);
        return -1;
    }
}
