/*
Input: nums = [3, 5, 4, 1, 1]
Output: [1, 2]
Explanation:
1 appears two times in the array and 2 is missing from nums 
*/
import java.util.Scanner;
public class RepeatingandMissingnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[] res=new int[2];
        int[] count=new int[n+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(count[i]==2) res[0]=i;
            if(count[i]==0) res[1]=i;
        }
        System.out.println("The repeating number is: " + res[0]);
        System.out.println("The missing number is: " + res[1]);
    }
}
