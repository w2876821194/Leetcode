package all.L2698;

class Solution {
    static int[] f = new int[1010];
    static {
        for (int i = 1; i <= 1000; i++) {
            //将之前累计值加入到当前i中
            f[i] = f[i - 1];
            if (check(i * i, i)) {
                f[i] += i * i;
            }
        }
    }

    /**
     * 求是否相等
     * 通过「取余」和「地板除」操作，得到截取部分和剩余部分，再继续递归处理
     * @param t 乘积值
     * @param x 原数
     * @return 是否相等
     */
    static boolean check(int t, int x) {
        if (t == x) {
            return true;
        }
        int d = 10;
        // 乘积值大于等于进制数并且乘积值小于等于原数
        while (t >= d && t % d <= x) {
            // 截取部分,原数-乘积数后n位
            if (check(t / d, x - (t % d))) {
                return true;
            }
            d *= 10;
        }
        return false;
    }
    public int punishmentNumber(int n) {
        return f[n];
    }
}
class Test {
    public static void main(String[] args) {
        new Solution().punishmentNumber(37);
    }
}
