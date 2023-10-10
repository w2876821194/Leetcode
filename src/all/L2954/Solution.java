package all.L2954;

import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public long repairCars(int[] ranks, int cars) {
        int min = Arrays.stream(ranks).summaryStatistics().getMin();
        long right = (long) min * cars * cars;
        long left = 0;
        while (left + 1 < right) {
            long mid = (left + right) >> 1;
            long asInt = Arrays
                    .stream(ranks)
                    .map(a -> (int) Math.sqrt((double) mid / a))
                    .summaryStatistics().getSum();
            if (asInt >= cars) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }
}

class Test {
    public static void main(String[] args) {
        new Solution().repairCars(new int[]{4, 2, 3, 1}, 10);
        System.out.println();
    }
}
