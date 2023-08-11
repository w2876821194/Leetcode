package all.L2488;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int max = 0, min = 0, index = 0, ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (; index < n; ++index) {
            if (nums[index] == k) {
                break;
            } else if (nums[index] > k) {
                max++;
            } else {
                min++;
            }
            if (map.containsKey(max-min)) {
                map.put(max-min,map.get(max-min)+1);
            }else {
                map.put(max-min,1);
            }
        }
        for (int i = index; i < n; i++) {
            min += nums[i] < k ? 1 : 0;
            max += nums[i] > k ? 1 : 0;
            if (map.containsKey(max-min)) {
                ans += map.get(max - min);
            }
            if (map.containsKey(max - min -1)){
                ans += map.get(max - min - 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] nums = {7, 6, 3, 2, 4, 9, 8, 1, 5};
//        int k = 4;
//        int[] nums = {2,3,1};
//        int k = 3;
        int[] nums = {2,3,1,4,5};
        int k = 4;
        System.out.println(countSubarrays(nums, k));
    }
}
