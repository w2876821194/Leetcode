package all.L931;

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min = 0x3f3f3f;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0) {
                    continue;
                }
                int x = j != 0 ? matrix[i - 1][j - 1] + matrix[i][j] : 0x3f3f3f;
                int y = matrix[i][j] + matrix[i - 1][j];
                int z = j != matrix[0].length - 1 ? matrix[i - 1][j + 1] + matrix[i][j] : 0x3f3f3f;

                matrix[i][j] = Math.min(x, Math.min(y, z));

                if (i == matrix.length - 1) {
                    min = Math.min(min, matrix[i][j]);
                }
            }
        }
        return min == 0x3f3f3f ? matrix[0][0] : min;
    }
}

class Test {
    public static void main(String[] args) {
        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        new Solution().minFallingPathSum(matrix);
    }
}
