//package L359;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class L6467 {
//}
//
//class Solution {
//    public int longestEqualSubarray(List<Integer> nums, int k) {
//        int n = nums.size();
//        int[][] dp = new int[n + 1][k + 1];
//        Map<Integer[], Integer[]> map = new HashMap<>();
//        int max = 0;
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= k; j++) {
//                // 前i个元素 删除k个元素的最长长度
//                // 不同,则等于dp[i][k - 1] + 1
//                // 相同,则 dp[i-1][k];
//                Integer[] integers = map.get(new Integer[]{i, j});
//                for (Integer p : integers) {
//
//                }
//                dp[i][j] = dp[i][k - 1] + 1;
//            }
//        }
//
//    }
//}
