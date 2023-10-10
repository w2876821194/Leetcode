package all.L1222;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int[][] arr = {{0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}};
        PriorityQueue<Integer[]> queue = new PriorityQueue<>(Comparator.comparingInt(x -> (Math.abs(x[0] - king[0]) + Math.abs(x[1] - king[1]))));
        List<List<Integer>> list = new ArrayList<>();
        boolean[] flags = new boolean[8];
        int num = 0;

        Arrays.stream(queens)
                .map(pair -> new Integer[]{pair[0], pair[1]})
                .forEach(queue::add);
        while (!queue.isEmpty() && num != 8) {
            Integer[] poll = queue.poll();
            int x = poll[0] - king[0];
            int y = poll[1] - king[1];

            int max = Math.max(Math.abs(x), Math.abs(y));
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][0] * max == x && arr[i][1] * max == y && !flags[i]) {
                    List<Integer> integers = new ArrayList<>();
                    integers.add(poll[0]);
                    integers.add(poll[1]);
                    list.add(integers);
                    flags[i] = true;
                    num++;
                    break;
                }
            }
        }
        return list;
    }
}

class Test {
    public static void main(String[] args) {
        int[][] queens = {{0, 1}, {1, 0}, {4, 0}, {0, 4}, {3, 3}, {2, 4}};
        new Solution().queensAttacktheKing(queens, new int[]{0, 0});
    }
}
