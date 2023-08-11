//package sword_offer.L22;
//
//public class jz56 {
//}
//
//class Solution {
//    public int[] singleNumbers(int[] nums) {
//        int len = nums.length;
//        int num = 0;
//        for (int i : nums) {
//            num ^= i;
//        }
//        int i = 1;
//        while ((i & num) == 0) {
//            i = i << 1;
//        }
//        int p = 0, q = 0;
//        for (int j : nums) {
//            if ((i & j) != 0) {
//                p ^= j;
//            } else {
//                q ^= j;
//            }
//        }
//        return new int[]{p, q};
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        int[] ints = {1, 2, 5, 2};
//        new Solution().singleNumbers(ints);
//    }
//}
