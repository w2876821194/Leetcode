package all;

public class L2337 {
}

class Solution {
    public boolean canChange(String start, String target) {
        int p = 0;
        int q = 0;
        while (p != start.length() || q != target.length()) {
            while (p < start.length() && start.charAt(p) == '_') {
                p++;
            }
            while (q < target.length() && target.charAt(q) == '_') {
                q++;
            }
            if (p == start.length() || q == target.length()) {
                if (p == q) {
                    return true;
                }else {
                    return false;
                }
            }
            if (p >= q && start.charAt(p) == target.charAt(q) && start.charAt(p) == 'L') {
                p++;
                q++;
            } else if (start.charAt(p) == 'R' && start.charAt(p) == target.charAt(q) && p <= q) {
                p++;
                q++;
            } else {
                return false;
            }
        }
        return true;
    }
}
