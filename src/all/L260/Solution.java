package all.L260;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(i -> {
            if (map.getOrDefault(i, 0) == 1) {
                map.remove(i);
            } else {
                map.put(i, 1);
            }
        });
        return map.keySet().stream().mapToInt(Integer::intValue).toArray();
    }
}
