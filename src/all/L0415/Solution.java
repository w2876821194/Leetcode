package all.L0415;

class Solution {
    public String addStrings(String num1, String num2) {
        int max = Math.max(num1.length(), num2.length());
        int len1 = num1.length();
        int len2 = num2.length();
        num1 = new StringBuilder().append(num1).reverse().toString();
        num2 = new StringBuilder().append(num2).reverse().toString();

        StringBuilder stringBuilder = new StringBuilder();

        boolean flag = false;
        boolean flag2 = false;
        for (int i = 0; i < max; i++) {
            char s1 = i >= len1 ? '0' : num1.charAt(i);
            char s2 = i >= len2 ? '0' : num2.charAt(i);
            int s = s1 + s2 - 2 * '0' + (flag ? 1 : 0);

            if (s >= 10) {
                s -= 10;
                flag2 = true;
            } else {
                flag2 = false;
            }
            stringBuilder.append((char) (s + '0'));
            flag = flag2;
        }
        if (flag) {
            stringBuilder.append("1");
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addStrings("456", "123"));
    }
}
