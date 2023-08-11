//package sword_offer.L08;
//
//public class jz10 {
//}
//
//class Solution {
//    int[] sum = new int[1010];
//
//    public int fib(int n) {
//        return dfs(n);
//    }
//
//    public int dfs(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1 || n == 2) {
//            if (sum[1] != 0 || sum[2] != 0) {
//                sum[1] = 1;
//                sum[2] = 1;
//            }
//            return 1;
//        }
//        if (sum[n] == 0) {
//            sum[n] = (dfs(n - 1) % 1000000007 + dfs(n - 2) % 1000000007) % 1000000007;
//        }
//        return sum[n];
//    }
//}
