package DP;
public class Knapsack {
    public static void main(String[] args) {
        // Knapsack problem implementation
        int[] weights={1,3,4};
        int[] values={1,4,5};
        int capacity=5;
        int n=weights.length;
        int[][] dp=new int[n+1][capacity+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=capacity;j++){
                if(j>=weights[i-1]){
                    dp[i][j]=Math.max(values[i-1]+dp[i-1][j-weights[i-1]],dp[i-1][j]);
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
        System.out.println("Knapsack table:");
        for(int i=0;i<=n;i++){
            for(int j=0;j<=capacity;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Maximum value in Knapsack: "+dp[n][capacity]);
    }
}
