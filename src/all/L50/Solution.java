package all.L50;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

class Solution {
    public int giveGem(int[] gem, int[][] operations) {
        Arrays.stream(operations).forEach(o -> {
            int x = o[0];
            int y = o[1];
            gem[y] += gem[x] / 2;
            gem[x] -= gem[x] / 2;
        });
        IntSummaryStatistics summaryStatistics = Arrays.stream(gem).summaryStatistics();
        return summaryStatistics.getMax() - summaryStatistics.getMin();
    }
}
