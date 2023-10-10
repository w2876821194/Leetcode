package all.L901;

import java.util.ArrayDeque;
import java.util.Deque;

class StockSpanner {
    Deque<int[]> start;
    int n;

    public StockSpanner() {
        start = new ArrayDeque<>();
        start.add(new int[]{-1,Integer.MAX_VALUE});
        n = -1;
    }

    public int next(int price) {
        n++;
        start.add(new int[]{});
        while (price >= start.peek()[1]) {
            start.pop();
        }
        int res = n - start.peek()[0];
        start.push(new int[]{n, price});
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
