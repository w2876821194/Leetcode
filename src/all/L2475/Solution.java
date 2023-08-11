package all.L2475;

class Solution {
    public int unequalTriplets(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    continue;
                }
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] != nums[k] && nums[k] != nums[i]) {
                        sum++;
                    }
                }
            }
        }
        return sum;
    }
}
