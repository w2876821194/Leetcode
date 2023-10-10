//package f1;
//
//import java.util.*;
//
//public class L7022 {
//}
//
//class klausur.L深信服.Solution {
//    public int minAbsoluteDifference(List<Integer> nums, int x) {
//        int abs = Integer.MAX_VALUE;
//        int n = nums.size();
//        Map<Integer, List<Integer>> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            if (!map.containsKey(nums.get(i))) {
//                List<Integer> list = new ArrayList<>();
//                list.add(i);
//                map.put(nums.get(i), list);
//            } else {
//                map.get(nums.get(i)).add(i);
//            }
//        }
//        Collections.sort(nums);
//        for (int i = 0; i < nums.size(); i++) {
//            innerLoop: for (int j = i; j < nums.size(); j++) {
//                Integer q = nums.get(i);
//                Integer p = nums.get(j);
//                List<Integer> list1 = map.get(q);
//                List<Integer> list2 = map.get(p);
//                for (Integer y : list1) {
//                    for (Integer k : list2) {
//                        if (Math.abs(y - k) >= x) {
//                            abs = Math.min(abs, Math.abs(p - q));
//                            break innerLoop;
//                        }
//                    }
//                }
//            }
//        }
//        return abs;
//    }
//}
//
////class klausur.L深信服.Solution {
////    public int minAbsoluteDifference(List<Integer> nums, int x) {
////        int abs = Integer.MAX_VALUE;
////        Queue<Integer> queue = new PriorityQueue<>();
////        for (int i = x; i < nums.size(); i++) {
////            queue.
////        }
////        return abs;
////    }
////}
//
//class Test {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(330702844);
//        list.add(313481959);
//        list.add(239224564);
//        list.add(609763700);
//        list.add(170531905);
//        new klausur.L深信服.Solution().minAbsoluteDifference(list, 0);
//    }
//}
