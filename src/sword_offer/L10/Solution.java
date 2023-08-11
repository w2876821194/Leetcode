//package sword_offer.L10;
//
//class Solution {
//    int[] dp;
//
//    public int translateNum(int num) {
//        if (num < 10) {
//            return 1;
//        }
//
//        int n = String.valueOf(num).length();
//        dp = new int[n + 1];
//        dp[1] = 1;
//        dp[0] = 1;
//        dp(num);
//        return dp[n];
//    }
//
//    public void dp(int n) {
//        String s = String.valueOf(n);
//        int length = s.length();
//        if (n < 100) {
//            if (dp[length] == 0) {
//                dp[length] = 1 + (n < 26 && n > 9 ? 1 : 0);
//            }
//        }
//        if (dp[length - 1] == 0) {
//            dp(n / 10);
//        }
//        if (dp[length - 2] == 0) {
//            dp(n / 100);
//        }
//        dp[length] = dp[length - 1] + (n % 100 < 26 && n % 100 > 9 ? dp[length - 2] : 0);
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
////        System.out.println(new Solution().translateNum(12258));
////        System.out.println(new Solution().translateNum(122)); //bcc mc bw
//        System.out.println(new Solution().translateNum(506)); //bcc mc bw
//    }
//}
