package all.L36;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Map.Entry<Set<Integer>, Set<Integer>>> map = new HashMap<>();
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int num = c - '0';
                    Map.Entry<Set<Integer>, Set<Integer>> entry = map.computeIfAbsent(num, k -> Map.entry(new HashSet<>(), new HashSet<>()));
                    Set<Integer> x = entry.getKey();
                    Set<Integer> y = entry.getValue();
                    // 存在则不符合
                    if (x.contains(i) || y.contains(j)) {
                        return false;
                    }
                    // 判断相邻的矩阵是否有这个数
                    int x0 = i / 3 * 3;
                    int y0 = j / 3 * 3;
                    for (int x1 = x0; x1 < x0 + 3; x1++) {
                        for (int y1 = y0; y1 < y0 + 3; y1++) {
                            if (x1 == i && y1 == j) {
                                continue;
                            }
                            if (board[x1][y1] == c) {
                                return false;
                            }
                        }
                    }
                    x.add(i);
                    y.add(j);
                }
            }
        }
        return true;
    }
}

class Main {
    public static void main(String[] args) {
//        char[][] board = {{".",".","4",".",".",".","6","3","."},{".",".",".",".",".",".",".",".","."},{"5",".",".",".",".",".",".","9","."},{".",".",".","5","6",".",".",".","."},{"4",".","3",".",".",".",".",".","1"},{".",".",".","7",".",".",".",".","."},{".",".",".","5",".",".",".",".","."},{".",".",".",".",".",".",".",".","."},{".",".",".",".",".",".",".",".","."}}
        char[][] board = {
                {'.', '.', '4', '.', '.', '.', '6', '3', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
                {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
                {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
                {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
        };
        System.out.println(new Solution().isValidSudoku(board));
    }
}
