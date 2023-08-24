package all.L1782;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] countPairs(int n, int[][] edges, int[] queries) {
        // 计数,记录每个点相连边的个数
        int[] sum = new int[n + 1];
        // 存储小+大对应的边数,为了减去重复
        Map<Integer, Integer> map = new HashMap<>();

        // 计算点对应的边数
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            sum[x]++;
            sum[y]++;
            map.merge(Math.min(x, y) << 16 | Math.max(x, y), 1, Integer::sum);
        }

        // 答案数组
        int[] ans = new int[queries.length];
        // 拷贝数组,为双指针排序
        int[] temp = sum.clone();
        Arrays.sort(temp);
        for (int i = 0; i < queries.length; i++) {
            int target = queries[i];
            int l = 1, r = n; // 相向双指针
            while (l < r) {
                if (temp[l] + temp[r] <= target) {
                    l++;
                } else {
                    ans[i] += r - l;
                    r--;
                }
            }

            for (java.util.Map.Entry<Integer, Integer> e : map.entrySet()) {
                int p = e.getKey(), q = e.getValue();
                int s = sum[p >> 16] + sum[p & 0xffff]; // 求得当前两点的边数和
                /*
                   当前两点的边数和大于当前queries值
                   边数和-公共边数小于queries值
                 */
                if (s > target && s - q <= target) {
                    ans[i]--;
                }
            }
        }
        return ans;
    }
}
