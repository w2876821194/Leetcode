package all.L2596;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0]!= 0) {
            return false;
        }
        int[][] flags = new int[][]{{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};
        int n = grid.length;
        int max = n * n - 1;
        return IntStream.range(0, grid.length)
                .allMatch(i -> IntStream.range(0, grid[0].length)
                        .allMatch(j ->
                                Arrays.stream(flags)
                                        .filter(k -> i + k[0] >= 0 && i + k[0] < n && j + k[1] >= 0 && j + k[1] < n)
                                        .anyMatch(k -> grid[i][j] == grid[i + k[0]][j + k[1]] - 1 || grid[i][j] == max)
                        )
                );
    }
}

class Test {
    public static void main(String[] args) {
//        int[][] grid = {{0, 11, 16, 5, 20}, {17, 4, 19, 10, 15}, {12, 1, 8, 21, 6}, {3, 18, 23, 14, 9}, {24, 13, 2, 7, 22}};
        int[][] grid = {{24,11,22,17,4},{21,16,5,12,9},{6,23,10,3,18},{15,20,1,8,13},{0,7,14,19,2}};
        new Solution().checkValidGrid(grid);
    }
}
