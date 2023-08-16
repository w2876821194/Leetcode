package all.L833;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int length = s.length();
        Map<Integer, String[]> map = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], new String[]{sources[i], targets[i]});
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(i)) {
                String[] strings = map.get(i);
                if (s.substring(i).indexOf(strings[0]) == 0) {
                    stringBuilder.append(strings[1]);
                    i += strings[0].length() - 1;
                } else {
                    stringBuilder.append(s.charAt(i));
                }
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}

class Test {
    public static void main(String[] args) {
        String s = "abcd";
        int[] indices = {0, 2};
        String[] sources = {"a", "cd"};
        String[] targets = {"eee", "ffff"};
        new Solution().findReplaceString(s, indices, sources, targets);
    }
}
