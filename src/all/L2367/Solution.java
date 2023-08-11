package all.L2367;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i < nums.length-1; i++) {
            if (set.contains(nums[i]+diff)&& set.contains(nums[i]+2*diff)) {
                sum++;
            }
            if (nums[i]+2*diff >= nums[nums.length-1]) {
                break;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        System.out.println(arithmeticTriplets(nums, diff));
    }
}
