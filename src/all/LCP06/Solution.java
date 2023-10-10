package all.LCP06;

import java.util.Arrays;

class Solution {
    public int minCount(int[] coins) {
        return Arrays.stream(coins).map(i -> i / 2 + i % 2).sum();
    }
}
