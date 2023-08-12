package all.L88;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m + n - m >= 0) System.arraycopy(nums2, 0, nums1, m, m + n - m);
        Arrays.sort(nums1);
    }
}
