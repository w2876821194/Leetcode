package all.L421;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findMaximumXOR(int[] nums) {
        // 最大值
        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }
        // 前导零个数
        int highBit = 31 - Integer.numberOfLeadingZeros(max);

        // 当前的最大异或值和掩码
        int ans = 0, mask = 0;
        // 存储已经出现过的数组元素
        Set<Integer> seen = new HashSet<>();
        for (int i = highBit; i >= 0; i--) { // 从最高位开始枚举
            seen.clear();
            // 用于过滤掉比当前位更低的位
            mask |= 1 << i;
            // 新的可能的最大异或值
            int newAns = ans | (1 << i); // 这个比特位可以是 1 吗？
            for (int x : nums) {
                // 将其低于第 i 位的比特位置为0，以过滤掉比当前位更低的位
                x &= mask;
                // 判断集合 seen 中是否包含异或结果 newAns ^ x。
                // 如果存在，表示找到了两个元素，它们的异或结果等于当前的最大异或值。
                if (seen.contains(newAns ^ x)) {
                    ans = newAns;
                    break;
                }
                seen.add(x);
            }
        }
        return ans;
    }
}

