package all.L1281;

import java.util.Arrays;

class Solution {
    public int subtractProductAndSum(int n) {
        String[] split = String.valueOf(n).split("");
        int[] array = Arrays.stream(split).mapToInt(Integer::valueOf).toArray();
        int sum = 1;
        int arr = 0;
        for (int i : array) {
            sum *= i;
            arr += i;
        }
        return sum - arr;
    }
}
