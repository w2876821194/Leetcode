//package match.L364;
//
//import java.util.Arrays;
//
//class Solution {
//    public String maximumOddBinaryNumber(String s) {
//        int len = s.length();
//
//        int num = 0;
//        for (char c : s.toCharArray()) {
//            num += c == '1' ? 1 : 0;
//        }
//        num--;
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < len; i++) {
//            if (i < num) {
//                stringBuilder.append('1');
//            } else {
//                stringBuilder.append('0');
//            }
//        }
//        stringBuilder.setCharAt(len - 1, '1');
//
//        return stringBuilder.toString();
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        new Solution().maximumOddBinaryNumber("111");
//    }
//}
