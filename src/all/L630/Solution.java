package all.L630;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution1 {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        int sum = 0;
        for (int[] c : courses) {
            int d = c[0], e = c[1];
            sum += d;
            q.add(d);
            if (sum > e) sum -= q.poll();
        }
        return q.size();
    }
}

class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> (b - a));

        int sum = 0;

        for (int[] c : courses) {
            int x = c[0];
            int y = c[1];

            sum += x;
            queue.add(x);
            if (sum > y) {
                sum -= queue.poll();
            }
        }
        return queue.size();
    }
}
