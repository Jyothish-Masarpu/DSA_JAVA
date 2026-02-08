/*
Leetcode-34
*/
package Searching;
import java.util.Arrays;
public class FirstLastOccurenceInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int first=findf(nums,target);
        int second=findl(nums,target);
        return new int[]{first,second};
    }
    public int findf(int[] nums,int target){
        int left=0,right=nums.length-1,ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return ans;
    }
    public int findl(int[] nums,int target){
        int left=0,right=nums.length-1,ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        FirstLastOccurenceInSortedArray obj=new FirstLastOccurenceInSortedArray();
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int[] ans=obj.searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
}
