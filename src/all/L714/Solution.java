package all.L714;

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; ++i) {
            // 第i天不持有股票=i-1天不持有股票或者i-1天持有股票今天卖出的最大值
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i] - fee);
            // 第i天持有股票=i-1天持有股票或者第i-1天不持有股票今天购买
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        // n-1天不持有股票
        return dp[n - 1][0];
    }
}

