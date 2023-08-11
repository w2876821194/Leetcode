package all.L2455;

class Solution {
    public int averageValue(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        } else {
            int sum = 0;
            int Num = 0;
            for (int num : nums) {
                if ((num % 3 == 0) && (num % 2 == 0)) {
                    Num++;
                    sum += num;
                }
            }
            return Num != 0 ? sum / Num : 0;
        }
    }
}
