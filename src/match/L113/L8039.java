//package match.L113;
//
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//class Solution {
//    public int minimumRightShifts(List<Integer> nums) {
//        int len = nums.size();
//        Map<Integer, Integer> map = new HashMap<>();
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.size(); i++) {
//            map.put(nums.get(i), i);
//            min = Math.min(min, nums.get(i));
//        }
//        int index = map.get(min);
//
//        for (int i = index + 1; i < index + nums.size(); i++) {
//            if (nums.get(i % len) <= nums.get((i - 1) % len)) {
//                return -1;
//            }
//        }
//        return index == 0 ? 0 : len - index;
//    }
//}
