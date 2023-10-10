package all.L2582;

class Solution {
    public int passThePillow(int n, int time) {
        // 一圈的时间
        int x = n - 1;
        // 一共走过的圈数
        int y = time / x;   
        // 剩余时间
        int z = time % x;
        return y % 2 == 0 ? z + 1 : n - z;
    }
}
