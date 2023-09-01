package all.L1654;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    int a;
    int b;
    int x;
    Set<Integer> set;
    boolean[] booleans = new boolean[6001];

    int min = Integer.MAX_VALUE;

    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        this.a = a;
        this.b = b;
        this.x = x;
        set = Arrays.stream(forbidden).boxed().collect(Collectors.toSet());

        dfs(0, 0, false);

        return min == Integer.MAX_VALUE ? -1 : min;
    }

    /**
     * 深度搜索
     *
     * @param index 当前索引
     * @param num   步数
     * @param flag  上一步是否为前进
     */
    public void dfs(int index, int num, boolean flag) {
        if (index < 0 || index > 6000 || set.contains(index) || booleans[index]) {
            return;
        }
        if (index == x) {
            min = Math.min(min, num);
            return;
        }

        if (flag) {
            booleans[index] = true;
        }

        dfs(index + a, num + 1, true);
        if (flag) {
            dfs(index - b, num + 1, false);
        }
    }
}

class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{14, 4, 18, 1, 15};
        new Solution().minimumJumps(arr, 3, 15, 9);
    }
}
