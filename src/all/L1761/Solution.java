package all.L1761;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int minTrioDegree(int n, int[][] edges) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            Set<Integer> orDefault1 = map.getOrDefault(x, new HashSet<>());
            orDefault1.add(y);
            map.put(x, orDefault1);
            Set<Integer> orDefault2 = map.getOrDefault(y, new HashSet<>());
            orDefault2.add(x);
            map.put(y, orDefault2);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    if (map.containsKey(i) && map.containsKey(j) && map.containsKey(k)) {
                        if (map.get(i).contains(j) && map.get(j).contains(k) && map.get(k).contains(i)) {
                            int num = map.get(i).size() + map.get(j).size() + map.get(k).size() - 6;
                            min = Math.min(min, num);
                        }
                    }
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}

class Test {
    public static void main(String[] args) {
        new Solution().minTrioDegree(6, new int[][]{{1, 2}, {1, 3}, {3, 2}, {4, 1}, {5, 2}, {3, 6}});
    }
}
