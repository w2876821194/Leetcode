package all.L2251;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = flowers.length;
        int[] starts = Arrays.stream(flowers)
                .map(i -> i[0])
                .sorted()
                .mapToInt(Integer::valueOf).toArray();

        int[] ends = Arrays.stream(flowers)
                .map(i -> i[1])
                .sorted()
                .mapToInt(Integer::valueOf).toArray();

        for (int i = 0; i < people.length; i++) {
            // flowers = [[1,6],[3,7],[9,12],[4,13]], people = [2,3,7,11]
            // start: 1,3,4,9
            // end: 6,7,12,13
            // 开花时间大于当前时间的索引-结束时间大于等于当前的索引
            people[i] = lowerBound(starts, people[i] + 1) - lowerBound(ends, people[i]);
        }
        return people;
    }

    // 返回 >= x 的第一个数的下标
    // 如果不存在（所有元素都小于 x），则返回 nums.length
    private int lowerBound(int[] nums, int x) {
        int left = -1, right = nums.length; // 开区间 (left, right)
        while (left + 1 < right) { // 区间不为空
            int mid = left + (right - left) / 2;
            if (nums[mid] < x) {
                left = mid; // 区间缩小为 (mid, right)
            } else {
                right = mid; // 区间缩小为 (left, mid)
            }
        }
        return right;
    }
}

