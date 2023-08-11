package all.L16;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.stream(nums).sorted().boxed().toArray();
        for (int i = 0; i < nums.length; i++){
//            int temp = tanums[i]
        }
        return target;
    }
}
class Test {
    public static void main(String[] args) {
        int [] nums = {-1,2,1,-4};
        int target = 1;
        new Solution().threeSumClosest(nums,target);
    }
}


