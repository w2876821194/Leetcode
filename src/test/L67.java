package test;

public class L67 {
}


class Solution {
    public int strToInt(String str) {
        StringBuilder set = set(str);
        long l = 0;
        try {
            l = Long.parseLong(set.toString());

        } catch (NumberFormatException e) {
            if (set.toString().length() == 0 || set.toString().equals("+") || set.toString().equals("-")) {
                return 0;
            }
            if (set.length() > 1 && set.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        } catch (Exception e) {
            return 0;
        }
        System.out.println(l);
        if (l > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (l < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        System.out.println(l);
        return Math.toIntExact(l);

    }

    public StringBuilder set(String str) {
        str = str.trim();
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = false; // 0 +- 1 0-9

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                stringBuilder.append(c);
                flag = true;
            } else if ((c == '-' || c == '+') && !flag) {
                stringBuilder.append(c);
                flag = true;
            } else {
                break;
            }
        }
        return stringBuilder;
    }
}

class Test {
    public static void main(String[] args) {
//        String str = "20000000000000000000";
//        String str = "-91283472332";
        String str = "+-2";
        new Solution().strToInt(str);
    }
}
