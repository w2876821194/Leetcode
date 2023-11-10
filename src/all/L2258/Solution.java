package all.L2258;

import java.lang.reflect.Array;
import java.util.*;

class Solution {
    int[][] flag = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int[][] grid;
    int m;
    int n;

    public int maximumMinutes(int[][] grid) {
        // 2 墙
        // 1 火
        // (0,0) 人
        m = grid.length;
        n = grid[0].length;
        this.grid = grid;
        Queue<Integer[]> peopleQueue = new ArrayDeque<>();
        Queue<Integer[]> firePos = new ArrayDeque<>();
        peopleQueue.add(new Integer[]{0, 0});
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    firePos.add(new Integer[]{i, j});
                }
            }
        }
        int[] people = bfs(peopleQueue);
        // 人到不了安全屋
        if (people[0] < 0) {
            return -1;
        }
        int[] fire = bfs(firePos);
        // 火到不了安全屋
        if (fire[0] < 0) {
            return 1_000_000_000;
        }
        int d = fire[0] - people[0];
        // 火比人先到安全屋
        if (d < 0) {
            return -1;
        }

        if (people[1] != -1 && people[1] + d < fire[1] || // 安全屋左边相邻格子，人比火先到
                people[2] != -1 && people[2] + d < fire[2]) { // 安全屋上边相邻格子，人比火先到
            return d;
        }
        return d - 1;
    }

    private int[] bfs(Queue<Integer[]> queue) {
        int[][] flags = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(flags[i], -1);
        }
        for (int i = 0; !queue.isEmpty(); i++) {
            int size = queue.size();
            while (size-- > 0) {
                Integer[] poll = queue.poll();
                flags[poll[0]][poll[1]] = i;
                for (int j = 0; j < 4; j++) {
                    int x = poll[0] + flag[j][0];
                    int y = poll[1] + flag[j][1];
                    if (x >= 0 && y >= 0 && x < m && y < n && flags[x][y] == -1 && grid[x][y] != 2) {
                        queue.add(new Integer[]{x, y});
                    }
                }
            }
        }
        // 安全屋-安全屋左-安全屋上
        return new int[]{flags[m - 1][n - 1], flags[m - 1][n - 2], flags[m - 2][n - 1]};
    }
}

class Test {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{0, 2, 0, 0, 0, 0, 0}, {0, 0, 0, 2, 2, 1, 0}, {0, 2, 0, 0, 1, 2, 0}, {0, 0, 2, 2, 2, 0, 2}, {0, 0, 0, 0, 0, 0, 0}};
        new Solution().maximumMinutes(grid);
    }
}
