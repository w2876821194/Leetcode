package all.L137;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(i -> {
            map.put(i, map.getOrDefault(i, 0) + 1);
        });
        return map.keySet().stream().filter(i -> map.get(i) == 1).collect(Collectors.toList()).get(0);
    }
}
