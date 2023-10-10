//package sword_offer.L27;
//
//import java.util.*;
//
//class jz59 {
//}
//
//class klausur.L深信服.Solution {
//    int[] nums;
//    int k;
//
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        this.nums = nums;
//        this.k = k;
//        return gcd();
////        return gcd().stream().mapToInt(Integer::intValue).toArray();
//    }
//
//
//    public int[] gcd() {
//        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
//        int[] list = new int[nums.length - k + 1];
//        Map<Integer, Integer> map = new HashMap<>();
//        int i = 0;
//        int l = 0;
//        int r = -1;
//        while (r - l < k - 1) {
//            r++;
//            queue.offer(nums[r]);
//        }
//        while (true) {
//            Integer poll = queue.peek();
//            while (map.containsKey(poll)) {
//                map.put(poll, map.get(poll) - 1);
//                if (map.get(poll).intValue() == 0) {
//                    map.remove(poll);
//                }
//                queue.poll();
//                poll = queue.peek();
//            }
//            list[i++] = poll.intValue();
//            map.put(nums[l], map.getOrDefault(nums[l], 0) + 1);
//            l++;
//            r++;
//            if (r == nums.length) {
//                return list;
//            }
//            queue.offer(nums[r]);
//        }
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        int[] nums = {1, -1};
//        int k = 1;
//        new klausur.L深信服.Solution().maxSlidingWindow(nums, k);
//    }
//}
