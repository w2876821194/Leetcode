package all.L2611;

import java.util.Arrays;

class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int n = reward1.length;
        int[][] reward = new int[n][2];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            reward[i][0] = reward2[i] - reward1[i];
            reward[i][1] = i;
        }
        Arrays.sort(reward, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < n; i++) {
            sum += i >= k ? reward2[reward[i][1]] : reward1[reward[i][1]];
        }
        return sum;
    }
}

class Test {
    public static void main(String[] args) {
//        int[] reward1 = {1, 1, 3, 4}, reward2 = {4, 4, 1, 1};
//        int k = 2;// 15
        int[] reward1 = {2, 1}, reward2 = {1, 2};
        int k = 1;
        new Solution().miceAndCheese(reward1, reward2, k);
    }
}
