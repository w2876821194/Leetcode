package all.L123;

class Solution {
    public int maxProfit(int[] prices) {
        int flag1 = -prices[0];
        int flag2 = 0;
        int flag3 = -prices[0];
        int flag4 = 0;

        for (int i = 1; i < prices.length; i++) {
            flag1 = Math.max(flag1, -prices[i]);
            flag2 = Math.max(flag2, flag1 + prices[i]);
            flag3 = Math.max(flag3, flag2 - prices[i]);
            flag4 = Math.max(flag4, flag3 + prices[i]);
        }
        return flag4;
    }
}
