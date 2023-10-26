package all.L2530;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((i, j) -> j - i);
        long sum = 0;
        Arrays.stream(nums).forEach(queue::add);
        while (k-- > 0) {
            Integer poll = queue.poll();
            sum += poll;
            queue.add((int) Math.ceil((double) poll / 3));
        }
        return sum;
    }
}
