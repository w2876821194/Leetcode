package all.L2731;

import java.util.Arrays;

class Solution {
    final int MOD = (int) (Math.pow(10,9) + 7);
//    final int MOD = (int) (10e9 + 7);
    long[] arr;
    int n;

    public int sumDistance(int[] nums, String s, int d) {
        this.n = nums.length;
        long[] arr = new long[n];
        this.arr = arr;
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i] + (s.charAt(i) == 'L' ? -d : d);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        long ans = 0, sum = 0;
//        final int mod = (int) 1e9 + 7;
//        for (int i = 0; i < n; ++i) {
//            ans = (ans + i * arr[i] - sum) % mod;
//            sum += arr[i];
//        }
//        return (int) ans;

        return (int) gcd(n - 1, n);
    }

    /**
     * @param x 重复个数
     * @param y 对应元素个数
     * @return 距离之和
     */
    public long gcd(int x, int y) {
        if (x <= 0 || y <= 0) {
            return 0;
        }
        return ((x * (arr[(n - y) / 2 + y - 1] - arr[(n - y) / 2]) % MOD) + gcd(x - 2, y - 2)) % MOD;
    }
}
