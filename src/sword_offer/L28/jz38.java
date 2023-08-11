//package sword_offer.L28;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class jz38 {
//}
//
//class Solution {
//    List<String> list = new ArrayList<>();
//    char[] s;
//    String str;
//
//    public String[] permutation(String s) {
//        this.s = s.toCharArray();
//        this.str = s;
//        gcd(0);
//        return list.toArray(new String[0]);
//    }
//
//    private void gcd(int i) {
//        if (i == str.length() - 1) {
//            list.add(String.valueOf(s));
//            return;
//        }
//        Set<Character> set = new HashSet<>();
//        for (int j = i; j < str.length(); j++) {
//            if (set.contains(s[j])) {
//                continue;
//            }
//            set.add(s[j]);
//            swap(i, j);
//            gcd(i + 1);
//            swap(i, j);
//        }
//    }
//    private void swap(int i, int j) {
//        char temp = s[i];
//        s[i] = s[j];
//        s[j] = temp;
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        String stirng = "abc";
//        new Solution().permutation(stirng);
//    }
//}
