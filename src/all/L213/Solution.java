package all.L213;

import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }


        int n = nums.length;
        int[] nums1 = new int[n - 1];
        int[] nums2 = new int[n - 1];
        System.arraycopy(nums, 0, nums1, 0, n - 1);
        System.arraycopy(nums, 1, nums2, 0, n - 1);

        int[] dp1 = new int[n];
        dp1[0] = 0;
        dp1[1] = nums1[0];
        for (int i = 1; i < n - 1; i++) {
            dp1[i + 1] = Math.max(dp1[i], dp1[i - 1] + nums1[i]);
        }

        int[] dp2 = new int[n];
        dp2[0] = 0;
        dp2[1] = nums2[0];
        for (int i = 1; i < n - 1; i++) {
            dp2[i + 1] = Math.max(dp2[i], dp2[i - 1] + nums2[i]);
        }
        return Math.max(dp1[n - 1], dp2[n - 1]);
    }
}

class Test {
    public static void main(String[] args) {
        new Solution().rob(new int[]{1, 2});
    }
}
