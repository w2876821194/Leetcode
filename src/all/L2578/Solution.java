package all.L2578;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int splitNum(int num) {
        Queue<Integer> queue = new PriorityQueue<>();
        Arrays.stream(String.valueOf(num).split(""))
                .filter(i -> !"0".equals(i))
                .map(Integer::parseInt)
                .forEach(queue::add);

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        while (queue.size() / 2 > 0) {
            Integer poll = queue.poll();
            a.append(poll);
            poll = queue.poll();
            b.append(poll);
        }

        String x = "".contentEquals(a) ? "0" : a.toString();
        String y = "".contentEquals(b) ? "0" : b.toString();

        if (queue.size() % 2 == 0) {
            return Integer.parseInt(x) + Integer.parseInt(y);
        } else {
            return Math.min(Integer.parseInt(x + queue.peek()) + Integer.parseInt(y),
                    Integer.parseInt(x) + Integer.parseInt(y + queue.peek()));
        }
    }
}
