package match.L361;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class L3 {
}

class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        int num = 0;
//        dp = new int[nums.size()];
//        Arrays.fill(dp, -1);

        List<Integer> flag = nums.stream().map(i -> i % modulo).collect(Collectors.toList());


        int[] l = new int[nums.size() + 1];
        int[] r = new int[nums.size() + 1];

        for (int i = 0; i <= nums.size(); i++) {
            if (i == 0) {
                l[0] = 0;
                continue;
            }
            l[i] = l[i - 1] + nums.get(i - 1);
        }

        for (int i = 0; i <= nums.size(); i++) {
            int j = nums.size() - i;
            if (i == 0) {
                l[j] = 0;
                continue;
            }
            l[i] = l[i - 1] + nums.get(j - 1);
        }

        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < r.length; j++) {
                if ((l[i] - r[j]) % modulo == k) {
                    num++;
                }
            }
        }
        return num;
    }
}

class Test {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(4);
        int modulo = 2;
        int k = 4;
        new Solution().countInterestingSubarrays(nums, modulo, k);
    }
}
