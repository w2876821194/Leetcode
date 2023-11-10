package all.L2609;

class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int n = s.length();
        int i = 0;
        int max = 0;
        while (i < n) {
            int zero = 0;
            while (i < n && s.charAt(i) == '0') {
                i++;
                zero++;
            }
            int one = 0;
            while (i < n && s.charAt(i) == '1') {
                i++;
                one++;
            }
            max = Math.max(max, Math.min(zero, one) * 2);
        }
        return max;
    }
}
