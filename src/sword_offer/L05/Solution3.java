package sword_offer.L05;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
}


class Solution {
    public char firstUniqChar(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                if (s.substring(i+1).indexOf(c) == -1) {
                    return c;
                }else {
                    set.add(c);
                }
            }
        }
        return ' ';
    }
}
