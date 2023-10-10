package match.L263.L8029;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        nums.sort(Comparator.comparingInt(i -> i.get(0)));

        int l = 0;
        int r = 0;
        int max;
        int sum = 0;
        while (r < nums.size() || l < nums.size()) {

            max = nums.get(r).get(1);

            while (r + 1 < nums.size() && max >= nums.get(r + 1).get(0)) {
                r++;
                max = Math.max(max, nums.get(r).get(1));
            }

            sum += max - nums.get(l).get(0) + 1;
            r++;
            l = r;
        }
        return sum;
    }
}

class Test {
    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        nums.add(arr);
        arr = new ArrayList<>();
        arr.add(5);
        arr.add(8);
        nums.add(arr);
        new Solution().numberOfPoints(nums);
    }
}
