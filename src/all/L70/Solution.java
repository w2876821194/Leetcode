package all.L70;

    class Solution {
        int [] sum ;
        public int climbStairs(int n) {
            sum = new int[n+1];
            return dp(n);
        }

        public int dp(int n) {
            if (sum[n]!= 0) {
                return sum[n];
            }
            if (n == 1) {
                sum[1] = 1;
                return 1;
            }
            if (n == 2) {
                sum[2] = 2;
                return 2;
            }
            else {
                sum[n] = dp(n-1)+dp(n-2);
                return sum[n];
            }
        }
    }
// 1 1
// 2 2
// 3 3
// 4 5
// 5 8
