package all.L1042;

import java.util.*;

class Solution {
    Map<Integer, Set<Integer>> map = new HashMap<>();
    int[] array;

    public int[] gardenNoAdj(int n, int[][] paths) {
        array = new int[n];
        for (int[] path : paths) {
            if (!map.containsKey(path[0])) {
                map.put(path[0], new HashSet<>());
                map.get(path[0]).add(path[1]);
            } else {
                map.get(path[0]).add(path[1]);
            }

            if (!map.containsKey(path[1])) {
                map.put(path[1], new HashSet<>());
                map.get(path[1]).add(path[0]);

            } else {
                map.get(path[1]).add(path[0]);
            }
        }
        bfs(1);

        return array;
    }

    private void bfs(int p) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(p);
        while (queue.size() != 0) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                Integer poll = queue.poll();
                setColor(poll, queue);
            }
        }
    }

    private void setColor(Integer poll, Queue<Integer> queue) {
        boolean[] color = new boolean[5];
        for (Integer integer : map.get(poll)) {
            int i = integer - 1;
            color[array[i]] = array[i] != 0;
            if (array[i] == 0) {
                queue.add(i + 1);
            }
        }
        for (int i = 1; i < color.length; i++) {
            if (!color[i]) {
                array[poll - 1] = i;
                break;
            }
        }

    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] paths = {{1, 2}, {2, 3}, {3, 1}};
        int n = 3;
        System.out.println(Arrays.toString(solution.gardenNoAdj(n, paths)));
    }
}
