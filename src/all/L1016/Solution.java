package all.L1016;

class Solution {
    public boolean queryString(String s, int n) {
        int i = 1;
        while (i != n + 1) {
            if (!s.contains(Integer.toBinaryString(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        new Solution().queryString("1",1);
    }
}
