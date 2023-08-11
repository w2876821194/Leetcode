package all.L1091;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    int[][] s = new int[][]{{0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}};
    int n;
    int[][] grid;
    boolean[][] flags;

    public int shortestPathBinaryMatrix(int[][] grid) {
        this.grid = grid;
        n = grid.length;
        flags = new boolean[n][n];
        return bfs();
    }


    public int bfs() {
        Queue<Integer[]> queue = new ArrayDeque<>();
        int min = 10000;
        if (grid[0][0] == 1) {
            return -1;
        }
        queue.add(new Integer[]{0, 0, 1});
        while (!queue.isEmpty()) {
            Integer[] poll = queue.poll();
            if (flags[poll[0]][poll[1]]) {
                continue;
            }
            flags[poll[0]][poll[1]] = true;
            if (poll[0] == n - 1 && poll[1] == n - 1) {
                min = Math.min(min, poll[2]);
                break;
            }

            for (int i = 0; i < 8; i++) {
                int p = s[i][0] + poll[0];
                int q = s[i][1] + poll[1];
                int k = poll[2];
                if (p >= 0 && p < n && q >= 0 && q < n) {
                    if (grid[p][q] == 0 && !flags[p][q]) {
                        queue.add(new Integer[]{p, q, k + 1});
                    }
                }
            }
        }
        return min == 10000 ? -1 : min;
    }
}

class Test {
    public static void main(String[] args) {
        int[][] grid = {{0,1},{1,0}};
        System.out.println(new Solution().shortestPathBinaryMatrix(grid));
    }
}
