package all.L2559;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] flags = new int[n + 1];
        int[] sum = new int[queries.length];
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);
        for (int i = 1; i < n + 1; i++) {
            flags[i] = flags[i - 1] + (map.containsKey(words[i - 1].charAt(0)) && map.containsKey(words[i - 1].charAt(words[i - 1].length() - 1)) ? 1 : 0);
        }
        for (int i = 0; i < queries.length; i++) {
            sum[i] = flags[queries[i][1] + 1] - flags[queries[i][0]];
        }
        return sum;
    }
}

class Test {
    public static void main(String[] args) {
        String[] words = new String[]{"aba", "bcb", "ece", "aa", "e"};
        int[][] queries = {{0, 2}, {1, 4}, {1, 1}};
        new Solution().vowelStrings(words, queries);
    }
}
