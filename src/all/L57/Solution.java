package all.L57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }
        int l = -1;
        int r;
        int min;
        int max;
        while (l + 1 < intervals.length && intervals[l + 1][0] <= newInterval[0]) {
            l++;
        }
        r = l;
        while (r + 1 < intervals.length && intervals[r + 1][0] <= newInterval[1]) {
            r++;
        }
        if (l == -1 && r == -1) {
            int[][] arr = new int[intervals.length + 1][2];
            System.arraycopy(arr, 0, intervals, 0, intervals.length);
            arr[intervals.length - 1] = newInterval;
            Arrays.sort(arr);
            return arr;
        }
        min = Math.min(intervals[l][0], newInterval[0]);
        max = Math.max(intervals[r][1], newInterval[1]);
        System.out.println(String.valueOf(l) + r);
        int[][] arr = new int[intervals.length - r + l][2];
        for (int i = 0, j = 0; i < intervals.length; i++) {
            if (i < l || i > r) {
                arr[j++] = intervals[i];
            } else {
                arr[j++] = new int[]{min, max};
                i += r - l;
            }
        }
        return arr;
    }

//    public int[][] insert(int[][] intervals, int[] newInterval) {
//        int n = intervals.length;
//        int[][] arr = new int[n + 1][2];
//        System.arraycopy(intervals,0,arr,0,n);
//        arr[n]  = newInterval;
//        System.out.println(Arrays.deepToString(arr));
//        return merge(arr);
//    }

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
