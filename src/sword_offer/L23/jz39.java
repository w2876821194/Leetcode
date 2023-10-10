//package sword_offer.L23;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class jz39 {
//}
//
//class klausur.L深信服.Solution {
//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int max = 0;
//        int num = nums[0];
//        for (int i : nums) {
//            if (!map.containsKey(i)) {
//                map.put(i, 1);
//            } else {
//                int n = map.get(i) + 1;
//                map.put(i, n);
//                if (n > max) {
//                    num = i;
//                    max = n;
//                }
//            }
//        }
//        return num;
//    }
//}
