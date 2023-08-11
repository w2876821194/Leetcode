package all.L2427;

public class Solution {
    public static int commonFactors(int a, int b) {
        int num = 0;
        int c = Math.min(a, b);
        int d = Math.max(a, b);
        for (int i = 1; i <= c; i++) {
            if (c % i == 0 && d % i == 0) {
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int a = 761, b = 253;
//        int a = 25, b = 30;
//        int a = 12, b = 6;
        System.out.println(commonFactors(a, b));
    }
}
