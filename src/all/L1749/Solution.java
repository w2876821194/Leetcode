package all.L1749;

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int[] dpMax = new int[nums.length]; // 最大值
        int[] dpMin = new int[nums.length]; // 最小值
        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        int max = Math.abs(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            dpMax[i] = Math.max(dpMax[i - 1] + nums[i], nums[i]);
            dpMin[i] = Math.min(dpMin[i - 1] + nums[i], nums[i]);
            max = Math.max(Math.max(Math.abs(dpMax[i]),Math.abs(dpMin[i])), max);
        }
        return max;
    }
}

class Test {
    public static void main(String[] args) {
//        int[] nums = new int[]{1, -3, 2, 3, -4};
        int[] nums = new int[]{2, -5, 1, -4, 3, -2};
        new Solution().maxAbsoluteSum(nums);
    }
}
