//package sword_offer.L09;
//
//public class jz42 {
//}
//
//class klausur.L深信服.Solution {
//    public int maxSubArray(int[] nums) {
//        if (nums.length == 0) {
//            return 0;
//        }
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        int max = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
//            max = Math.max(dp[i], max);
//        }
//        return max;
//    }
//}
