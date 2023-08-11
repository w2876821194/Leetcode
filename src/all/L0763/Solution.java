package all.L0763;

import java.util.*;

class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer[]> map = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                Integer[] list = new Integer[]{501, -1};
                list[0] = Math.min(list[0], i);
                list[1] = i;
                map.put(c, list);
            } else {
                Integer[] list = map.get(c);
                list[0] = Math.min(list[0], i);
                list[1] = Math.max(list[1], i);
            }
        }
        int k = 0;
        for (double i = 0.5; i < s.length(); i++) {
            k++;
            int j = 0;
            for (Character character : map.keySet()) {
                Integer[] integers = map.get(character);
                if (integers[0] > i || integers[1] < i) {
                    j++;
                }
            }
            if (j == map.size()) {
                    l.add(k);
                    k = 0;
            }
        }
        return l;
    }
}

class Test {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(new Solution().partitionLabels(s));
    }
}
