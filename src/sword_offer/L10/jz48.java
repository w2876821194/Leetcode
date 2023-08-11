package sword_offer.L10;

import java.util.HashMap;

public class jz48 {
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int num = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            int j = map.getOrDefault(c, -1);
            map.put(c, i);
            num = num < i - j ? num + 1 : i - j;
            max = Math.max(max, num);
        }
        return max;
    }
}
