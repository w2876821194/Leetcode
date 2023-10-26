package all.L1726;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = nums[i] * nums[j];
                sum += map.containsKey(temp) ? map.get(temp) * 8 : 0;
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        return sum;
    }
}
