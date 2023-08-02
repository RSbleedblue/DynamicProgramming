public class Solution {

    public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
        int[][] dp = new int[n + 1][maxWeight + 1];
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= maxWeight; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][maxWeight];
    }
}
