package all.L1267;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int countServers(int[][] grid) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        int num = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    list1.add(i);
                    list2.add(j);
                    map1.put(i, map1.getOrDefault(i, 0) + 1);
                    map2.put(j, map2.getOrDefault(j, 0) + 1);
                }
            }
        }

        for (int i = 0; i < list1.size(); i++) {
            Integer integer1 = list1.get(i);
            Integer integer2 = list2.get(i);
            if (map1.get(integer1) > 1 || map2.get(integer2) > 1) {
                num++;
            }
        }
        return num;
    }
}
