package all.L1388;

class Solution {
    int n;

    public int maxSizeSlices(int[] slices) {
        int n = slices.length;
        // 长度为n的数组只能取最多n/3个数
        this.n = n / 3;
        int[] arr1 = new int[n - 1];
        int[] arr2 = new int[n - 1];
        // 包含第一个元素的数组
        System.arraycopy(slices, 0, arr1, 0, n - 1);
        // 不包含第一个元素的数组
        System.arraycopy(slices, 1, arr2, 0, n - 1);
        int max1 = gcd(arr1);
        int max2 = gcd(arr2);
        return Math.max(max1, max2);
    }


    public int gcd(int[] nums) {
        int m = nums.length;
        int[][] dp = new int[m + 1][n + 1];
        // dp[i][j] 代表前i个数中选择j个不相邻的数的最大值
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // 前i个数,选择j个不相邻的最大值的来源
                // 选择第i个数, 则等于 当前数+前i-2个数,选择j-1个最大值
                // 不选择第i个数,则等于 前i-1个数,选择j个最大值
                dp[i][j] = Math.max(dp[i - 1][j], (i >= 2 ? dp[i - 2][j - 1] : 0) + nums[i - 1]);
            }
        }
        return dp[m][n];
    }
}

class Test {
    public static void main(String[] args) {
        int[] slices = new int[]{1, 2, 3, 4, 5, 6};
        new Solution().maxSizeSlices(slices);
    }
}
