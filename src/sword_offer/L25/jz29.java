//package sword_offer.L25;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class jz29 {
//}
//
//class Solution {
//    int[][] p = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
//    boolean[][] flags;
//
//    int[][] matrix;
//
//    List<Integer> list = new ArrayList<>();
//
//    public int[] spiralOrder(int[][] matrix) {
//        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//            return new int[0];
//        }
//        flags = new boolean[matrix.length][matrix[0].length];
//        this.matrix = matrix;
//        gcd(0, 0, 0);
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }
//
//    public void gcd(int x, int y, int z) {
//        System.out.println("x:" + x + "y:" + y);
//        list.add(matrix[x][y]);
//        flags[x][y] = true;
//        int i = z;
//        do {
//            int[] q = p[i];
//            int xx = q[0] + x;
//            int yy = q[1] + y;
//            if (xx >= 0 && yy >= 0 && xx < matrix.length && yy < matrix[0].length && !flags[xx][yy]) {
//                gcd(xx, yy, i);
//                break;
//            }
//            i++;
//            if (i == p.length) {
//                i = 0;
//            }
//        } while (i != z);
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        int[][] arr = new int[][]{
////                {1, 2, 3, 4},
////                {8, 5, 6, 7},
////                {9, 10, 11, 12},
////                {13, 14, 15, 16}
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        new Solution().spiralOrder(arr);
//    }
//}
