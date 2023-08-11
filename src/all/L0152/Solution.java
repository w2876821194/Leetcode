package all.L0152;

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length - 1;
        int[] leftArr = new int[n + 2];
        int[] rightArr = new int[n + 2];

        for (int i = 0; i < n + 2; i++) {
            if (i == 0) {
                leftArr[i] = 1;
                rightArr[i] = 1;
                continue;
            }
            leftArr[i] = leftArr[i - 1] * nums[i - 1];
        }

        int max = 0;
        for (int i = 0; i < leftArr.length; i++) {
            for (int j = i + 1; j < leftArr.length; j++) {
                if (leftArr[i] == 0) {
                    continue;
                }
                max = Math.max(max, leftArr[j] / leftArr[i]);
            }
        }
        return nums.length == 1 ? nums[0] : max;
    }
}

class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{0,2};
        new Solution().maxProduct(nums);
    }
}
