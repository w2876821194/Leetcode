package sword_offer.L14;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class jz13 {
}

class Solution {
    boolean[][] flags;
    int[][] p = new int[][]{{1, 0}, {0, 1}};
    int k;
    int sum = 0;

    public int movingCount(int m, int n, int k) {
        flags = new boolean[m][n];
        this.k = k;
        bfs();
        return sum;
    }

    public void bfs() {
        Queue<Integer[]> queue = new ArrayDeque<>();
        queue.offer(new Integer[]{0, 0});
        while (!queue.isEmpty()) {
            Integer[] poll = queue.poll();
            int x = poll[0];
            int y = poll[1];
            if (!flags[x][y]) {
                flags[x][y] = true;
                sum++;
                for (int[] num : p) {
                    int i = x + num[0];
                    int j = y + num[1];
                    if (meet(i, j)) {
                        queue.offer(new Integer[]{i, j});
                    }
                }
            }
        }
    }

    public boolean meet(int x, int y) {
        if (x < 0 || y < 0 || x >= flags.length || y >= flags[0].length || flags[x][y]) {
            return false;
        }

        AtomicInteger sum = new AtomicInteger();
        String[] s = (String.valueOf(x) + y).split("");
        Arrays.stream(s).mapToInt(Integer::valueOf).forEach(sum::addAndGet);
        return sum.get() <= k;
    }
}
