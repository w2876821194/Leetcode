//package sword_offer.L05;
//
//
////class klausur.L深信服.Solution {
////    int target;
////    int[][] matrix;
////
////    int X_INDEX;
////    boolean Y_INDEX;
////
////    public boolean findNumberIn2DArray(int[][] matrix, int target) {
////        this.matrix = matrix;
////        this.target = target;
////        if (this.matrix.length == 0 || this.matrix[0].length == 0) {
////            return false;
////        }
////
////
////        findX(0, matrix[0].length - 1);
////        findY(0, matrix.length - 1);
////        return Y_INDEX;
////    }
////
////    public void findX(int l, int r) {
////        if (l > r) {
////            return;
////        }
////        int m = (l + r) / 2;
////
////        if ((target >= matrix[0][m] && m + 1 == matrix[0].length) || (target >= matrix[0][m] && m + 1 < matrix[0].length && target < matrix[0][m + 1])) {
////            X_INDEX = m;
////            return;
////        }
////
////        if (matrix[0][m] > target) {
////            findX(l, m - 1);
////        } else {
////            findX(m + 1, r);
////        }
////    }
////
////    public void findY(int l, int r) {
////        if (l > r) {
////            return;
////        }
////
////        int m = (l + r) / 2;
////
////        if (matrix[m][X_INDEX] == target) {
////            Y_INDEX = true;
////            return;
////        }
////        if (matrix[m][X_INDEX] < target) {
////            findY(m + 1, r);
////        } else {
////            findY(l, m - 1);
////        }
////    }
////}
//
//
////class Test1 {
////    public static void main(String[] args) {
//////        int[][] arr = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
//////        int[][] arr = new int[][]{{1,1}};
////        int[][] arr = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
////        new klausur.L深信服.Solution().findNumberIn2DArray(arr, 19);
////    }
////}
//
//
//class klausur.L深信服.Solution {
//    boolean[][] booleans;
//    int[][] matrix;
//    int target;
//
//    boolean flag;
//
//    public boolean findNumberIn2DArray(int[][] matrix, int target) {
//        if (matrix.length == 0 || matrix[0].length == 0) {
//            return false;
//        }
//
//        this.matrix = matrix;
//        this.target = target;
//        booleans = new boolean[matrix.length][matrix[0].length];
//        bfs(0, 0);
//        return flag;
//    }
//
//    public void bfs(int x, int y) {
//        if (flag || booleans[x][y]) {
//            return;
//        }
//
//        if (matrix[x][y] == target) {
//            flag = true;
//            return;
//        } else {
//            booleans[x][y] = true;
//        }
//        if (x + 1 < matrix.length && matrix[x + 1][y] <= target) {
//            bfs(x + 1, y);
//        }
//        if (y + 1 < matrix[0].length && matrix[x][y + 1] <= target) {
//            bfs(x, y + 1);
//        }
//    }
//}
