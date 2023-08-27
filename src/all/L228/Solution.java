package all.L228;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int l = 0;
        int r = 1;
        while (r <= nums.length) {
            while (r < nums.length && nums[r] == nums[r - 1] + 1) {
                r++;
            }

            if (l == r - 1) {
                list.add(String.valueOf(nums[l]));
            } else {
                list.add(nums[l] + "->" + nums[(r - 1)]);
            }
            l = r;
            r++;
        }
        return list;
    }
}
