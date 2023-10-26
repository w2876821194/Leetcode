package all.L1155;

class Solution {
    static final int MOD = 1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        // dp[i][j]为i个筛子和为j的个数
        int[][] dp = new int[n + 1][target + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                for (int l = 1; l <= k; l++) {
                    // 当前遍历的和必须大于当前筛子数
                    if (j - l >= 0) {
                        // 当期i个筛子和为j的个数 = 当前筛子个数 + i-1个筛子和为j - l 的个数
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - l]) % MOD;
                    }
                }
            }
        }
        return dp[n][target];
    }
}
