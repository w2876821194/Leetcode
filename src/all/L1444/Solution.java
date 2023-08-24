package all.L1444;

import java.util.Arrays;

class Solution {
    // 模
    public static final int MOD = (int) 1e9 + 7;
    // 前缀和对象
    MatrixSum MATRIXSUM;
    // 当前状态记忆化数组
    int[][][] FLAGS;

    public int ways(String[] pizza, int k) {
        // 创建二维前缀和
        MATRIXSUM = new MatrixSum(pizza);
        int m = pizza.length, n = pizza[0].length();
        FLAGS = new int[k][m][n];
        // 将所有元素进行初始化
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {
                // 只能全部覆盖一行(int[])
                Arrays.fill(FLAGS[i][j], -1); // -1 表示没有计算过
            }
        }
        // 求左上角(0,0) 右下角(m,n)的方案数
        return dfs(k - 1, 0, 0, m, n);
    }

    /**
     * 递归
     */
    private int dfs(int c, int p, int q, int m, int n) {
        if (c == 0) {
            return MATRIXSUM.query(p, q, m, n) > 0 ? 1 : 0;
        }
        // 记忆化,已知结果
        if (FLAGS[c][p][q] != -1) {
            return FLAGS[c][p][q];
        }
        // res是分的数量
        int res = 0;
        // 枚举横坐标,垂直切
        for (int i = 0; i < n; i++) {
            // 当前坐标存在苹果
            if (MATRIXSUM.query(p, q, m, i) > 0) {
                res = (res + dfs(c - 1, p, i, m, n)) % MOD;
            }
        }
        // 枚举纵坐标,水平切
        for (int i = 0; i < m; i++) {
            // 当前坐标存在苹果
            if (MATRIXSUM.query(p, q, i, n) > 0) {
                res = (res + dfs(c - 1, i, q, m, n)) % MOD;
            }
        }
        // 记忆化
        return FLAGS[c][p][q] = res;
    }
}

class MatrixSum {
    // 二维前缀和
    private final int[][] SUM;
    /**
     * 初始化
     */
    public MatrixSum(String[] matrix) {
        int m = matrix.length, n = matrix[0].length();
        SUM = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                SUM[i + 1][j + 1] = SUM[i + 1][j] + SUM[i][j + 1] - SUM[i][j] + (matrix[i].charAt(j) == 'A' ? 1 : 0);
            }
        }
    }
    /**
     * 求左上角为(r1,c2) 右上角为(r2,c2)范围的前缀和
     */
    public int query(int r1, int c1, int r2, int c2) {
        return SUM[r2][c2] - SUM[r2][c1] - SUM[r1][c2] + SUM[r1][c1];
    }
}
