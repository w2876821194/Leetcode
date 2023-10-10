package all.L2603;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public int collectTheCoins(int[] coins, int[][] edges) {
        int n = coins.length;
        List<Integer>[] collar = new ArrayList[n];
        Arrays.setAll(collar, e -> new ArrayList<>());
        int[] flags = new int[n];

        for (int[] e : edges) {
            int x = e[0];
            int y = e[1];

            collar[x].add(y);
            collar[y].add(x);
            flags[x]++;
            flags[y]++;
        }
        int num = n - 1;
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (flags[i] == 1 && coins[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            num--;
            for (int y : collar[queue.poll()]) {
                flags[y]--;
                if (flags[y] == 1 && coins[y] == 0) {
                    queue.add(y);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (flags[i] == 1 && coins[i] == 1) {
                queue.add(i);
            }
        }

        num -= queue.size();

        for (int x : queue) {
            for (int y : collar[x]) {
                flags[y]--;
                if (flags[y] == 1) {
                    num--;
                }
            }
        }

        return Math.max(num * 2, 0);
    }
}
