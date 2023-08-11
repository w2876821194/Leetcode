package all.L1163;

public class Solution {

    //    public String lastSubstring(String s) {
//        int n = s.length();
//        int first = 0, last = 0;
//
//        char a = 0;
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) > a) {
//                list = new ArrayList<>();
//                list.add(i);
//                a = s.charAt(i);
//            } else if (s.charAt(i) == a) {
//                list.add(i);
//            }
//
//
//        }
//
//        if (a == 'a') {
//            return s.substring(1, n);
//        }
//
//
//        int index = 0;
//        last = list.get(index);
//        first = last;
//
//        while (true) {
//            if (s.charAt(last) > s.charAt(first)) {
//                first = last;
//            } else if (s.charAt(last) == s.charAt(first)) {
//                // 判断是否换first指针位置;
//                if (!s.substring(last).equals(s.substring(first, n - last + first))) {
//                    int flag = s.substring(first, n - last + first).compareTo(s.substring(last));
//                    first = flag > 0 ? first : last;
//                }
//            }
//            index++;
//
//            if (index == list.size()) {
//                break;
//            }
//            last = list.get(index);
//        }
//        return s.substring(first, n);
//    }
    public String lastSubstring(String s) {
        int i = 0, j = 1, n = s.length();
        while (j < n) {
            int k = 0; // 增值
            while (j + k < n && s.charAt(i + k) == s.charAt(j + k)) {
                k++; // 如果以i开头和以j开头的字符串后第k位相等则+1
            }
            if (j + k < n && s.charAt(i + k) < s.charAt(j + k)) {   // 如果以j开头第k位大于i开头第k位或者k=0情况(相邻有比i更大的数)
                // 说明当前以j开头的字符串比i开头的字符串字典序大
                int t = i;
                i = j;  //
                j = Math.max(j + 1, t + k + 1); // j的位置取决于两种情况(1. j++,2. 已比较的字符串尾++)
            } else {
                j = j + k + 1;  // 说明以j开头的字符串没i开头的字符串大
            }
        }
        return s.substring(i);
    }


    public static void main(String[] args) {
//        String s = "leetcode";
//        String s = "zrziy";
//        String s = "aznsd";
        String s = "xbylisvborylklftlkcioajuxwdhahdgezvyjbgaznzayfwsaumeccpfwamfzmkinezzwobllyxktqeibfoupcpptncggrdqbkji";
//        String s = "abab";
        Solution solution = new Solution();
        System.out.println(solution.lastSubstring(s));
    }


}

//zrziy
//0 1
//0 2 - 1 3
//
