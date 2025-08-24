package all.L1493;

class Solution {
    public int longestSubarray(int[] nums) {
        // 左指针位置
        int leftIndex = 0;
        // 右指针位置
        int rightIndex = 0;
        // 0的位置
        int zeroIndex = 0;
        // 0的个数
        int zeroCount = 0;
        // 最大长度
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            // 当前位置为1
            if (nums[i] == 1) {
                rightIndex++;
            } else {
                // 当前位置为0
                // 0的个数为0
                if (zeroCount == 0) {
                    zeroIndex = i;
                    zeroCount++;
                    rightIndex++;
                } else {
                    // 0的个数不为0
                    leftIndex = zeroIndex + 1;
                    zeroIndex = i;
                    rightIndex++;
                }
            }
            maxLength = Math.max(maxLength, rightIndex - leftIndex - 1);
        }
        return maxLength;
    }
}

class Main {
    public static void main(String[] args) {
//        int[] nums = {1, 1, 0, 1};
        int[] nums = {1, 1, 1};
        Solution solution = new Solution();
        int result = solution.longestSubarray(nums);
        System.out.println(result);
    }
}
