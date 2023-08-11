package all.interview;

public class Solution5 {
    public static int maxValue(int[][] grid) {
        int[][] indexs = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    indexs[i][j] = grid[i][j];
                } else if (i == 0) {
                    indexs[i][j] = indexs[i][j-1]+grid[i][j];
                } else if (j == 0) {
                    indexs[i][j] = grid[i][j]+ indexs[i-1][j];
                } else {
                    if (indexs[i][j-1]>=indexs[i-1][j]) {
                        indexs[i][j] = indexs[i][j-1]+grid[i][j];
                    }else {
                        indexs[i][j] = indexs[i-1][j]+grid[i][j];
                    }
                }
            }
        }
        return indexs[grid.length-1][grid[0].length-1];
    }

    public static void main(String[] args) {
        int [][] a = {{1,2,5},{3,2,1}};
        System.out.println(maxValue(a));
    }
}
