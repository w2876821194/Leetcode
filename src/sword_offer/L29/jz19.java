//package sword_offer.L29;
//
//public class jz19 {
//}
//
//class Solution {
//    public boolean isMatch(String s, String p) {
//        int sLen = s.length();
//        int pLen = p.length();
//        boolean[][] flags = new boolean[sLen + 1][pLen + 1];
//        for (int i = 0; i <= sLen; i++) {
//            for (int j = 0; j <= pLen; j++) {
//                if (j == 0) {
//                    //除[0][0]其他都置为false没有比较对象
//                    // 当前0个字符或者前0个正则都为false
//                    flags[i][j] = i == 0;
//                } else {
//                    // 上一个不是*
//                    if (p.charAt(j - 1) != '*') {
//                        // 前一个相等或者前一个正则是.
//                        if (i > 0 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) {
//                            flags[i][j] = flags[i - 1][j - 1];
//                        }
//                    } else {
//                        // 上一个是*
//                        // 如果当前正则大于2,则说明这项可以不用判断,直接取不要这两项的校验结果
//                        if (j >= 2) {
//                            flags[i][j] |= flags[i][j - 2];
//                        }
//                        // 如果前一个字符和前两个正则相同,或者上两个正则是.,则当前位置的判断取当前结果和前一个字符的或结果
//                        if (i >= 1 && j >= 2 && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')) {
//                            flags[i][j] |= flags[i - 1][j];
//                        }
//                    }
//                }
//            }
//        }
//
//        return flags[sLen][pLen];
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        new Solution().isMatch("aa", "a*");
//    }
//}
