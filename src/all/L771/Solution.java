package all.L771;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        int num = 0;
        for (int i = 0; i < stones.length(); i++) {
            num = num + (set.contains(stones.charAt(i)) ? 1 : 0);
        }
        return num;
    }
}
