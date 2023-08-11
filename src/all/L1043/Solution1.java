package all.L1043;

// 会超时的递归代码
class Solution1 {
    private int[] arr;
    private int k;

    public int maxSumAfterPartitioning(int[] arr, int k) {
        this.arr = arr;
        this.k = k;
        return dfs(arr.length - 1);
    }

    private int dfs(int i) {
        // i=-1 时不会进入循环
        int res = 0;
        for (int j = i, mx = 0; j > i - k && j >= 0; --j) {
            mx = Math.max(mx, arr[j]); // 一边枚举 j，一边计算子数组的最大值
            res = Math.max(res, dfs(j - 1) + (i - j + 1) * mx);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] a = {1,18,17,1};
        int b = 3;
        Solution1 solution = new Solution1();
        System.out.println(solution.maxSumAfterPartitioning(a, b));
    }
}

