//package sword_offer.L22;
//
//public class jz56_2 {
//}
//
//class Solution {
//    public int singleNumber(int[] nums) {
//        int p = 0, q = 0;
//        for (int num : nums) {
//            p = (p ^ num) & ~q;// 1
//            q = (q ^ num) & ~p;// 0
//        }
//        return p;
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
////        int[] nums = new int[]{5, 2, 2, 2, 5, 5, 4};
//        int[] nums = new int[]{1,1,6,1};
//        new Solution().singleNumber(nums);
//    }
//}
//
