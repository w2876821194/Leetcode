package all.L2560;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

class Solution {

    public int minCapability(int[] nums, int k) {
        IntSummaryStatistics intSummaryStatistics = Arrays.stream(nums).summaryStatistics();
        // 最大值
        int max = intSummaryStatistics.getMax();
        // 最小值
        int min = intSummaryStatistics.getMin();

        while (min <= max) {
            //平均值
            int mid = (max + min) / 2;
            // 标记
            boolean flag = true;
            // 统计符合比mid小的数
            int count = 0;
            for (int num : nums) {
                if (num <= mid && flag) {
                    count++;
                    flag = false;
                } else {
                    flag = true;
                }
            }

            if (count >= k) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
}




