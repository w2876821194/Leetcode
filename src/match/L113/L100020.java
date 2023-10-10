package match.L113;

import java.util.*;

class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        Integer[] array = nums.toArray(new Integer[0]);
        int l = 0;
        int r = 1;

        while (l < array.length) {
            int left = nums.get(l);
            while (r < array.length && array[r] <= left) {
                r++;
            }
            array[l] = -1;
            array[r] = -1;

            while (l < array.length && array[l] == -1) {
                l++;
            }

            r = l;
        }
        return (int) Arrays.stream(array).filter(i -> i != -1).count();
    }
}


class Test {
    public static void main(String[] args) {
        new Solution().minLengthAfterRemovals(Arrays.asList(1, 1, 4, 4, 5, 5));
    }
}
