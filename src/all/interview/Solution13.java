package all.interview;

import java.util.Arrays;

class Solution13 {
//    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
//        int n = rowSum.length, m = colSum.length;
//        int[][] matrix = new int[n][m];
//        int i = 0, j = 0;
//        while (i < n && j < m) {
//            int v = Math.min(rowSum[i], colSum[j]);
//            matrix[i][j] = v;
//            rowSum[i] -= v;
//            colSum[j] -= v;
//            if (rowSum[i] == 0) {
//                ++i;
//            }
//            if (colSum[j] == 0) {
//                ++j;
//            }
//        }
//        return matrix;
//    }

    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] array = new int[rowSum.length][colSum.length];
        int i = 0,j = 0;

        while (i < rowSum.length &&j<colSum.length) {
          array[i][j] = Math.min(rowSum[i],colSum[j]);

          rowSum[i]-=array[i][j];
          colSum[j]-=array[i][j];

          if (rowSum[i] == 0) {
              i++;
          }
          if (colSum[j] == 0) {
              j++;
          }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] rowSum = {5,7,10}, colSum = {8,6,8};
        System.out.println(Arrays.deepToString(restoreMatrix(rowSum, colSum)));
    }
}


// 01 10     1000 0111
