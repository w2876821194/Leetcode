//package sword_offer.L13;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class jz57 {
//}
//
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        if (nums.length == 1) {
//            return new int[0];
//        }
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            if (set.contains(target - num)) {
//                return new int[]{num, target - num};
//            }
//            set.add(num);
//        }
//        return new int[0];
//    }
//}
