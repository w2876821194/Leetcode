package all.L1637;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static int maxWidthOfVerticalArea(int[][] points) {
       Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int num = 0;
        for (int i = 0; i < points.length-1; i++) {
            int max = Math.max(points[i][0], points[i+1][0]);
            int min = Math.min(points[i][0], points[i+1][0]);
            num = Math.max(num, max-min);
        }
        return num;
    }

    public static void main(String[] args) {
        int[][] points = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        System.out.println(maxWidthOfVerticalArea(points));
    }
}
