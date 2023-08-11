package all.L2500;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        for (int[] ints : grid) {
            Arrays.sort(ints);
        }
        for (int i = 0; i < grid[0].length; i++) {
            int max = grid[0][i];
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(max, grid[j][i]);
            }
            sum += max;
        }
        return sum;
    }
}

class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 7, 3},
                {1, 6, 4},
                {9, 2, 8}
        };

        // 获取矩阵的行数和列数
        int rows = matrix.length;
        int cols = matrix[0].length;

        // 按照纵向进行排序
        for (int col = 0; col < cols; col++) {
            final int c = col; // 需要在lambda表达式中使用的变量需要声明为final
            Arrays.sort(matrix, Comparator.comparingInt(arr -> arr[c]));
        }

        // 打印排序后的二维数组
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
