import java.util.*;
public class MaximumSubArraySum{
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
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0) sum=0;
        }
        System.out.println("Maximum SubArray sum is: "+max);
    }
}