package all.L2240;

class Solution {
    public long waysToBuyPensPencils(long total, long cost1, long cost2) {
        long max = Math.max(cost1, cost2);
        long min = Math.min(cost1, cost2);

        long n = 0;
        long ans = 0;

        while (n <= total) {
            long sum = total - n;
            ans += sum / min + 1;
            n += max;
        }
        return ans;
    }
}
