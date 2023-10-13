package all.L2562;

class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n = nums.length;
        long sum = 0;
        for (int i = 0; i < n / 2; i++) {
            sum += Integer.parseInt(nums[i] + "" + nums[n - i - 1]);
        }
        return n % 2 == 0 ? sum : sum + nums[n / 2];
    }
}
