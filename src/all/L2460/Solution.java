package all.L2460;

class Solution {
    public int[] applyOperations(int[] nums) {
        int length = nums.length;
        int[] arr = new int[length];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                arr[j] = nums[i];
                break;
            }
            if (nums[i] == nums[i + 1] && nums[i] != 0) {
                arr[j++] = nums[i] * 2;
                nums[i + 1] = 0;
            } else if (nums[i] != 0) {
                arr[j++] = nums[i];
            }
        }
        return arr;
    }
}
