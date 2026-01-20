//Rotate an array by k positions.
import java.util.*;
public class RotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of positions to rotate the array: ");
        int k=sc.nextInt();
        sc.close();
        k=k%n;
        int rotated[]=new int[n];
        for(int i=0;i<n;i++){
            rotated[(i+k)%n]=arr[i];
        }
        for(int i:rotated){
            System.out.print(i+" ");
        }
    }
}
