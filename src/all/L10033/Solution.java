package all.L10033;

import java.util.PriorityQueue;

class Solution {
    public int storeWater(int[] bucket, int[] vat) {
        int[] ans = new int[bucket.length];
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int flag = 0, min = 0;
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] == 0) {
                flag++;
                bucket[i] = 1;
            }
            int avg = vat[i] / bucket[i] + (vat[i] % bucket[i] == 0 ? 0 : 1);
            q.add(new int[]{avg, i});
            min = Math.max(min,avg);
        }
        min += flag;

        while (!q.isEmpty()) {
            int[] poll = q.poll();
            if (poll[0]==0) {
                continue;
            }

            int i = poll[1];
            bucket[i]++;
            flag++;
            int avg = vat[i] / bucket[i] + (vat[i] % bucket[i] == 0 ? 0 : 1);
            q.add(new int[]{avg, i});
            if (Math.min(min,min-poll[0]+avg)==min) {
                break;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] bucket = {9, 0, 1}, vat = {0, 2, 2};
        new Solution().storeWater(bucket, vat);
    }
}
