import java.util.*;
public class SortColors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        int zeros=0,ones=0;
        for(int num: nums){
            if(num==0) zeros++;
            else if(num==1) ones++;
        }
        for(int i=0;i<zeros;i++) nums[i]=0;
        for(int i=zeros;i<zeros+ones;i++) nums[i]=1;
        for(int i=zeros+ones;i<n;i++) nums[i]=2;
        System.out.println("After Sorting: ");
        for(int num:nums) System.out.print(num+" ");
    }
}
