package match.L263;

import java.util.*;

class Solution {
    public int minimumMoves(int[][] grid) {
        // 多点坐标
        List<Integer[]> list1 = new LinkedList<>();
        // 少点坐标
        List<Integer[]> list2 = new ArrayList<>();
        // 多点个数
        Map<Integer[], Integer> flags = new HashMap<>();
        // 多点到少点的距离
        Map<Integer[], List<Integer>> map = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Integer[] integers = {i, j};
                if (grid[i][j] > 1) {

                    flags.put(integers, grid[i][j]);
                    list1.add(integers);
                }
                if (grid[i][j] == 0) {
                    list2.add(integers);
                }
            }
        }
        for (Integer[] integers : list1) {
            for (Integer[] value : list2) {
                int m = Math.abs(integers[0] - value[0]) + Math.abs(integers[1] - value[1]);
                List<Integer> orDefault = map.getOrDefault(integers, new ArrayList<>());
                orDefault.add(m);
                map.put(integers, orDefault);
            }
        }

        int[] arr = new int[list2.size()];
        Arrays.fill(arr, Integer.MAX_VALUE);

        for (int i = 0; i < arr.length; i++) {
            Integer[] j = null;
            for (Integer[] integers : map.keySet()) {
                if (arr[i] > map.get(integers).get(i) && flags.get(integers) > 0) {
                    arr[i] = Math.min(arr[i], map.get(integers).get(i));
                    j = integers;
                }
                flags.put(j, flags.get(j) - 1);
            }
        }

        return Arrays.stream(arr).sum();
    }
}

class Test {
    public static void main(String[] args) {
        new Solution().minimumMoves(new int[][]{{1, 1, 0}, {1, 1, 1}, {1, 2, 1}});
    }
}
