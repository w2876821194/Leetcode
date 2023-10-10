package all.L1921;

import java.util.Objects;
import java.util.PriorityQueue;

class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int num = 0;
        Integer last;
        for (int i = 0; i < dist.length; i++) {
            queue.offer(dist[i] / speed[i] + (dist[i] % speed[i] == 0 ? 0 : 1));
        }
        last = 0;
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            if (!Objects.equals(poll, last)) {
                num++;
                last++;
            } else {
                return num;
            }
        }
        return num;
    }
}

class Test {
    public static void main(String[] args) {
        new Solution().eliminateMaximum(new int[]{1, 3, 4}, new int[]{1, 1, 1});
    }
}
