package all.L2591;

class Solution {
    public int distMoney(int money, int children) {
        if (money < children) {
            return -1;
        }
        money -= children;
        int min = Math.min(money / 7, children);
        children -= min;
        money -= min * 7;

        if ((children == 0 && money > 0) || (children == 1 && money == 3)) {
            min--;
        }
        return min;
    }
}
