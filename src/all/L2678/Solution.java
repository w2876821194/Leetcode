package all.L2678;

import java.util.Arrays;

class Solution {
    public int countSeniors(String[] details) {
        return (int) Arrays.stream(details).map(i -> Integer.valueOf(i.substring(11, 13))).filter(i -> i > 60).count();
    }
}
