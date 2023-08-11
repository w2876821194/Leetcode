package all.L1017;

public class Solution {
    public static String baseNeg2(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();

        while (n != 0) {
            if (n % -2 == 0) {
                stringBuilder.append("0");
            } else {
                n--;
                stringBuilder.append("1");
            }
            n /= -2;
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(baseNeg2(n));
    }
}
