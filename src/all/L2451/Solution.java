package all.L2451;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String oddString(String[] words) {
        int n = words[0].length();
        int[][] arr = new int[words.length][n-1];

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < words.length; j++) {
                arr[j][i] = words[j].charAt(i+1) - words[j].charAt(i);
            }
            Map<Integer,List<Integer>> map  = new HashMap<>();
            for (int j = 0; j < words.length; j++) {
               if (!map.containsKey(arr[j][i])) {
                   map.put(arr[j][i],new ArrayList<>());
               }
               map.get(arr[j][i]).add(j);
            }
            for (Integer integer : map.keySet()) {
                if (map.get(integer).size() == 1) {
                    return words[map.get(integer).get(0)];
                }
            }
        }
        return "";
    }
}
class Test {
    public static void main(String[] args) {
        String[] words = new String[]{"wwe","yyg","ssa","ttb","ddd","ssa","xxf","ssa","ttb","xxf","xxf","zzh","wwe","yyg","xxf"};
        System.out.println(new Solution().oddString(words));
    }
}
