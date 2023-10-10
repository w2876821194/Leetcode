package match.L263.L8049;

class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int x = Math.abs(sx - fx);
        int y = Math.abs(sy - fy);
        if (x == y && y == 0 && t == 1) {
            return false;
        }

        int max = Math.max(x, y);
        return t >= max;
    }
}
