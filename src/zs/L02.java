package zs;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class L02 {
}

class Solution {
    List<Integer> nums;
    int m;
    boolean flag;
    boolean[][] flags;

    public boolean canSplitArray(List<Integer> nums, int m) {
        if (nums.size() == 1 || nums.size() == 2) {
            return true;
        }

        this.nums = nums;
        this.m = m;
        int len = nums.size();
        flags = new boolean[len][len];
        AtomicInteger sum = new AtomicInteger();
        nums.forEach(sum::addAndGet);
        ds(0, len - 1, sum.get());
        return flag;
    }

    public void ds(int l, int r, int sum) {
        if (l == r - 1) {
            if (sum >= m) {
                flag = true;
            }
        }
        if (!flag && l + 1 < r && sum - nums.get(l) >= m && flags[l][r]) {
            ds(l + 1, r, sum - nums.get(l));
        }
        if (!flag && r - 1 > l && sum - nums.get(r) >= m) {
            ds(l, r - 1, sum - nums.get(r));
        }
        flags[l][r] = flag;
    }
}

class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 3, 2, 3);
        new Solution().canSplitArray(list, 6);
    }
}
