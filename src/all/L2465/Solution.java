package all.L2465;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        Set<Double> set = new HashSet<>();

        while (l < r) {
            set.add((nums[l] + nums[r]) / 2.0);
            l++;
            r--;
        }

        return set.size();
    }
}

class Test {
    public static void main(String[] args) {
        int[] nums = {9, 5, 7, 8, 7, 9, 8, 2, 0, 7};
        new Solution().distinctAverages(nums);
    }
}
