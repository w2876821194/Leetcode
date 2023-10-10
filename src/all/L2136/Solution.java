package all.L2136;

import java.util.PriorityQueue;

class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int length = growTime.length;
        PriorityQueue<Integer[]> queue = new PriorityQueue<>((i, j) -> j[1] - i[1]);
        for (int i = 0; i < length; i++) {
            queue.add(new Integer[]{plantTime[i], growTime[i]});
        }
        int max = Integer.MIN_VALUE;
        int day = 0;
        while (!queue.isEmpty()) {
            Integer[] poll = queue.poll();
            day += poll[0];
            max = Math.max(max, day + poll[1]);
        }
        return max;
    }
}
