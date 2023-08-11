package all.L1289;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int minFallingPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int min = Integer.MAX_VALUE;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            Queue<Integer> queue = new PriorityQueue<>();
            if (i != 0) {
                for (int j = 0; j < n; j++) {
                    queue.add(dp[i - 1][j]);
                }
            }
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    dp[i][j] = grid[i][j];
                } else {
                    if (dp[i - 1][j] != queue.peek()) {
                        dp[i][j] = queue.peek() + grid[i][j];
                    } else {
                        queue.poll();
                        dp[i][j] = queue.peek() + grid[i][j];
                        queue.add(dp[i - 1][j]);
                    }
                }
                if (i == m - 1) {
                    min = Math.min(min, dp[i][j]);
                }
            }
        }
        return min;
    }
}

class Test {
    public static void main(String[] args) {
//        int[][] grids = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] grids = {
                {2, 2, 1, 2, 2},
                {2, 2, 1, 2, 2},
                {2, 2, 1, 2, 2},
                {2, 2, 1, 2, 2},
                {2, 2, 1, 2, 2}};
        new Solution().minFallingPathSum(grids);
    }
}
