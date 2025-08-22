package all.L3195;

class Solution {
    public int minimumArea(int[][] grid) {
        int[] x = new int[]{1001, -1};
        int[] y = new int[]{1001, -1};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    x[0] = Math.min(x[0], i);
                    x[1] = Math.max(x[1], i);
                    y[0] = Math.min(y[0], j);
                    y[1] = Math.max(y[1], j);
                }
            }
        }
        return (x[1] - x[0] + 1) * (y[1] - y[0] + 1);
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = new int[][]{{0, 1, 0}, {1, 0, 1}};
        System.out.println(solution.minimumArea(grid));
    }
}
