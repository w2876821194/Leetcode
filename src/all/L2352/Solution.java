package all.L2352;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    int[][] grid;
    Map<Integer, List<Integer>> top = new HashMap<>();
    int sum = 0;

    public int equalPairs(int[][] grid) {
        this.grid = grid;
        for (int i = 0; i < grid.length; i++) {
            if (!top.containsKey(grid[0][i])) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                top.put(grid[0][i], list);
            } else {
                top.get(grid[0][i]).add(i);
            }
        }
        for (int i = 0; i < grid.length; i++) {
            int num = grid[i][0];
            if (top.containsKey(num)) {
                for (int j = 0; j < top.get(num).size(); j++) {
                    sum += eq(i, top.get(num).get(j), 1) ? 1 : 0;
                }
            }
        }

        return sum;
    }

    public boolean eq(int x, int y, int z) {
        if (z >= grid.length) {
            return true;
        }
        return grid[x][z] == grid[z][y] && eq(x, y, z + 1);
    }
}

class Test {
    public static void main(String[] args) {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        new Solution().equalPairs(grid);
    }
}
