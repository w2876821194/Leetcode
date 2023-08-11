package all.interview;

public class Solution4 {
    public static int minimumDeletions(String s) {
        // 前缀和
        int[] sums = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                if (s.charAt(i) == 'a') {
                    sums[i] = 1;
                } else {
                    sums[i] = 0;
                }
                continue;
            }
            sums[i] = sums[i - 1] + ((s.charAt(i) == 'a' ? 1 : 0));
        }
        //所有a变b
        //所有b变a
        int min = Math.min(sums[s.length() - 1], s.length() - sums[s.length() - 1]);
        for (int i = 0; i < s.length(); i++) {
            // 若选当前i为分割点
            // 前面b数,后面a数(后面a的个数 = 最后a的个数-当前位置前面a的个数 )
            // i+1-sum[i] + sum[s.length()-1]-sums[i]
            int num = i + 1 - sums[i] + sums[s.length() - 1] - sums[i];
            min = Math.min(num, min);

        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minimumDeletions("bbaaaaabb"));
    }
}
