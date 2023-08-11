package all.L1156;

class Solution {
    public int maxRepOpt1(String text) {
        int n = text.length();
        int l = 0;
        int[] arr = new int[26];
        int max = 0;
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            arr[c - 'a']++;
        }
        while (l < n) {
            int i = l;
            int c = text.charAt(i);
            while (i < n && text.charAt(i) == c) {
                i++;
            }
            int j = i + 1;
            while (j < n && text.charAt(j) == c) {
                j++;
            }
            int length = j - l;
            length = Math.min(length,arr[c-'a']);
            max = Math.max(max, length);
            l = i;
        }
        return max;

    }
}

class Test {
    public static void main(String[] args) {
//        String text = "ababa";
//        String text = "aaabbaaa";
        String text = "aaaaa";
//        String text = "abcdef";
        new Solution().maxRepOpt1(text);
    }
}
