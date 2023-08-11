//package sword_offer.L29;
//
//import java.util.HashSet;
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.Set;
//
//public class jz49 {
//}
//
//class Solution {
//    public int nthUglyNumber(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        Queue<Long> queue = new PriorityQueue<>();
//        Queue<Long> queue1 = new PriorityQueue<>();
//        Set<Long> set = new HashSet<>();
//        queue.offer(1L);
//        set.add(1L);
//        int i = 0;
//        while (i < n) {
//            Long poll = queue.poll();
//            i++;
//            if (!set.contains(poll * 2)) {
//                set.add(poll * 2);
//                queue.offer(poll * 2);
//                queue1.offer(poll * 2);
//            }
//            if (!set.contains(poll * 3)) {
//                set.add(poll * 3);
//                queue.offer(poll * 3);
//                queue1.offer(poll * 3);
//            }
//            if (!set.contains(poll * 5)) {
//                set.add(poll * 5);
//                queue.offer(poll * 5);
//                queue1.offer(poll * 5);
//            }
//        }
//        int j = 1;
//        while (j != n - 1) {
//            System.out.println(queue1.poll());
//            j++;
//        }
//        return Math.toIntExact(queue1.poll());
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        new Solution().nthUglyNumber(5);
//    }
//}
