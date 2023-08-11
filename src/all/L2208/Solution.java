package all.L2208;

import java.util.PriorityQueue;

class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> queue = new PriorityQueue<>((a, b) -> b.compareTo(a));
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            queue.offer((double) nums[i]);
            sum += nums[i];
        }
        double num = 0;
        int i = 0;
        while (num < sum / 2.0) {
            Double poll = queue.poll();
            poll = poll / 2;
            num += poll;
            queue.offer(poll);
            i++;
        }
        return i;
    }
}

class Test {
    public static void main(String[] args) {
        int[] array = new int[]{18, 22, 62, 61, 1, 88, 17, 98, 38, 32, 51, 57, 7, 29, 40, 61, 62, 13, 89, 41, 73, 85, 88, 60, 59, 76, 71, 76, 76, 41, 29, 43, 19, 9, 79};
        new Solution().halveArray(new int[]{1});
    }
}
