package all.L2605;

import java.util.*;

class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue3 = new PriorityQueue<>();
        boolean flag = false;

        for (int j : nums1) {
            set.add(j);
            priorityQueue1.offer(j);
        }

        for (int j : nums2) {
            if (!set.add(j)) {
                flag = true;
                priorityQueue3.offer(j);
            }
            priorityQueue2.offer(j);
        }

        int n = Math.min(priorityQueue1.peek(), priorityQueue2.peek()) * 10 + Math.max(priorityQueue1.peek(), priorityQueue2.peek());

        return flag ? priorityQueue3.peek() : n;
    }
}
