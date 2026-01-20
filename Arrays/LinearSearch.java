import java.util.*;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key to search: ");
        int key=sc.nextInt();
        sc.close();
        boolean found=false;
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                index=i;
                found=true;
                break;
            }
        }
        if(found) System.out.println("Element found at index: "+index);
        else System.out.println("Element not found");
    }
}
