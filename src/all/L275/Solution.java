package all.L275;

import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int l = 1;
        int r = n;
        while (r >= l) {
            // 所在位置
            int h = (l + r) / 2;
            if (citations[n - h] >= h) {
                l = h + 1;
            } else {
                r = h - 1;
            }
        }
        return r;
    }
}

class Test {
    public static void main(String[] args) {
        new Solution().hIndex(new int[]{0, 1, 2, 3, 4, 5, 6});
    }
}
