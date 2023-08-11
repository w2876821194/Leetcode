//package sword_offer.L14;
//
//public class jz12 {
//}
//
//class Solution {
//    char[][] board;
//    boolean[][] flags;
//    String word;
//    int[][] p = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
//
//    boolean flag;
//
//    public boolean exist(char[][] board, String word) {
//        this.word = word;
//        this.board = board;
//        flags = new boolean[board.length][board[0].length];
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[0].length; j++) {
//                if (flag) {
//                    return true;
//                }
//                if (board[i][j] == word.charAt(0)) {
//                    dfs(i, j, 0);
//                }
//            }
//        }
//        return flag;
//    }
//
//    public void dfs(int x, int y, int z) {
//        if (flag || x < 0 || y < 0 || x >= board.length || y >= board[0].length || z >= word.length() || flags[x][y]) {
//            return;
//        }
//        if (board[x][y] == word.charAt(z)) {
//            flags[x][y] = true;
//            if (z == word.length() - 1) {
//                flag = true;
//                return;
//            }
//            for (int[] ints : p) {
//                if (!flag) {
//                    dfs(x + ints[0], y + ints[1], z + 1);
//                }
//            }
//        }
//        flags[x][y] = false;
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
//        System.out.println(new Solution().exist(board, "ABCC"));
//    }
//}
