package all.L823;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    long MOD = (long) (1e9 + 7);
    Map<Integer, Integer> map = new HashMap<>();

    int[] array;

    long[] dp;

    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        array = arr;
        dp = new long[n];
        Arrays.fill(dp, -1);
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += dfs(arr[i], i);
        }
        return (int) (ans % MOD);
    }

    public long dfs(int val, int index) {
        if (dp[index] != -1) {
            return dp[index];
        }
        long sum = 1;
        for (int i = 0; i < index; i++) {
            int x = array[i];
            if (val % x == 0 && map.containsKey(val / x)) {
                sum += dfs(x, i) * dfs(val / x, map.get(val / x));
            }
        }
        return dp[index] = sum;
    }
}
