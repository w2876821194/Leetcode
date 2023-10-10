//package f1;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class L6939 {
//}
//
//class klausur.L深信服.Solution {
//    public int maxSum(int[] nums) {
//        Map<Integer, List<Integer>> map = new HashMap<>();
//        int max = -1;
//        for (int i : nums) {
//            int j = 1; // 位数进制
//            int p = 0; // 最大数
//            while (i % j != i) {
//                p = Math.max(p, i / j % 10);
//                j *= 10;
//            }
//            if (!map.containsKey(p)) {
//                List<Integer> list = new ArrayList<>();
//                list.add(i);
//                map.put(p, list);
//            } else {
//                map.get(p).add(i);
//            }
//
//            List<Integer> list = map.get(p);
//            for (int k = 0; k < list.size(); k++) {
//                for (int l = k + 1; l < list.size(); l++) {
//                    max = Math.max(max, list.get(k) + list.get(l));
//                }
//            }
//
//        }
//        return max;
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        new klausur.L深信服.Solution().maxSum(new int[]{51, 71, 17, 24, 42});
//    }
//}
