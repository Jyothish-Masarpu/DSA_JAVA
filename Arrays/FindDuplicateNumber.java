import java.util.Scanner;

class Solution {
    public void findDuplicate(int[] nums) {
        int n=nums.length;
        boolean[] arr=new boolean[n+1];
        for(int i=0;i<n;i++){
            if(arr[nums[i]]) {
                System.out.println("The duplicate number is: " + nums[i]);
                return;
            }
            arr[nums[i]]=true;
        }
        System.out.println("No duplicate number found.");
    }
    public static void main(String[] args){
        Solution sol=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        sol.findDuplicate(nums);
    }
}