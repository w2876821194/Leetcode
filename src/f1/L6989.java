//package f1;
//
//import java.util.*;
//
//class klausur.L深信服.Solution {
//    public long maxSum(List<Integer> nums, int m, int k) {
//        if (nums.size() == 1) {
//            return nums.get(0);
//        }
//        int l = 0;
//        int r = 0;
//        long sum = nums.get(0);
//        long max = 0;
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(nums.get(0), 1);
//
//        while (r - l < k - 1) {
//            r++;
//            int num = nums.get(r);
//            sum += num;
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        while (r < nums.size()) {
//            if (map.keySet().size() >= m) {
//                max = Math.max(max, sum);
//            }
//            if (r == nums.size() - 1) {
//                break;
//            }
//            map.put(nums.get(l), map.get(nums.get(l)) - 1);
//            if (map.get(nums.get(l)) == 0) {
//                map.remove(nums.get(l));
//            }
//            sum -= nums.get(l);
//            l++;
//            r++;
//            map.put(nums.get(r), map.getOrDefault(nums.get(r), 0) + 1);
//            sum += nums.get(r);
//        }
//        return max;
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        List<Integer> nums = Arrays.asList(Arrays.stream(new int[]{1, 1, 1, 3}).boxed().toArray(Integer[]::new));
//        int m = 2, k = 2;
//        new klausur.L深信服.Solution().maxSum(nums, m, k);
//    }
//}
//// s1 = "abcdba", s2 = "cabdab"
//// acb cba
//// abc
//// bda adb
