package all.L2682;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] circularGameLosers(int n, int k) {
        if (n == 1) {
            return new int[0];
        }
        Set<Integer> set = new HashSet<>();
        int flag = 0;
        int p = 1;
        while (!set.contains(flag)) {
            set.add(flag);
            flag += k * p;
            flag %= n;
            p++;
        }
        System.out.println(set);
        int[] arr = new int[n - set.size()];
        for (int j = 0, i = 0; j < n; j++) {
            if (!set.contains(j)) {
                arr[i++] = j + 1;
            }
        }
        return arr;
    }
}

class Test {
    public static void main(String[] args) {
        new Solution().circularGameLosers(5, 2);
    }
}
// 1,2,3,4,5    2
// 1,2,3,4,5,1,2,3,4,5,1,2,3,4,5
// 1,3,2,3
// 2,4,6
// 1,3,2,3
