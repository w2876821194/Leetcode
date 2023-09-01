package all.L56;

import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<Integer[]> list = new ArrayList<>();
        int l;
        int r;
        int i = 0;
        while (i < intervals.length) {
            l = intervals[i][0];
            r = intervals[i][1];
            while (i < intervals.length && intervals[i][0] <= r) {
                r = Math.max(r, intervals[i][1]);
                i++;
            }
            list.add(new Integer[]{l, r});
        }
        return list.stream()
                .map(innerArray -> Arrays.stream(innerArray).mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
    }

}

