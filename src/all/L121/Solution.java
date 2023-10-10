package all.L121;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(prices[i] - prices[i - 1], max);
            prices[i] = Math.min(prices[i - 1], prices[i]);
        }
        return max;
    }
}
