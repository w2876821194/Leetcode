package all.L394;

import java.util.Stack;
import java.util.stream.IntStream;

class Solution {

    StringBuilder stringBuilder = new StringBuilder();

    public String decodeString(String s) {
        // 数字
        Stack<Integer> num = new Stack<>();
        // 字符串
        Stack<String> str = new Stack<>();
        // 括号
        Stack<Character> stack = new Stack<>();
        // 字符串
        StringBuilder string = new StringBuilder();
        // 数字
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                if (string.length() != 0) {
                    str.add(string.toString());
                    string = new StringBuilder();
                }
                number.append(c);
            } else if (c == '[') {
                if (number.length() != 0) {
                    num.add(Integer.valueOf(number.toString()));
                }
                stack.add(c);
                number = new StringBuilder();
            } else if (c == ']') {
                if (string.length() != 0) {
                    str.add(string.toString());
                }
                stack.pop();
                string = new StringBuilder();
                String stringBuilder1 = toString(num.pop(), str.pop());
                str.add((str.isEmpty() ? "" : str.pop()) + stringBuilder1);
            } else {
                string.append(c);
            }
        }
        while (!str.isEmpty()) {
            stringBuilder.append(str.pop());
        }
        return stringBuilder.toString() + string;
    }

    public String toString(Integer num, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(0, num).forEach(i -> stringBuilder.append(str));
        return stringBuilder.toString();
    }
}

class Test {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        new Solution().decodeString(s);
    }
}
// 3[a2[c]]
// cc
