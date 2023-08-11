package sword_offer.L04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4 {
}

class Solution {
    public List<String> removeComments(String[] source) {
        List<String> list = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < source.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            if (flag) {
                stringBuilder.append(list.get(list.size() - 1));
                list.remove(list.get(list.size() - 1));
            }
            String s = source[i];
            boolean flag2 = true;
            for (int j = 0; j < s.length() - 1; j++) {
                char c = s.charAt(j);
                if (flag && c == '*' && s.charAt(j + 1) == '/') {
                    flag = false;
                    if (j + 1 == s.length() - 1) {
                        flag2 = false;
                    } else {
                        flag2 = true;
                    }
                    j++;
                    continue;
                }

                if (flag) {
                    continue;
                }


                if (c == '/' && s.charAt(j + 1) == '/') {
                    flag2 = false;
                    break;
                }

                if (c == '/' && s.charAt(j + 1) == '*') {
                    flag = true;
                    flag2 = false;
                    j++;
                    continue;
                }
                stringBuilder.append(c);
            }
            if (flag2 && !flag) {
                stringBuilder.append(s.charAt(s.length() - 1));
            }
            if (stringBuilder.length() != 0) {
                list.add(stringBuilder.toString());
            }
        }
        return Arrays.asList(list.toArray(new String[0]));
    }
}

class Test2 {
    public static void main(String[] args) {
        String[] strings = new String[]{"    /*/ declare members;/**/"};
        new Solution().removeComments(strings);
//        /*/ declare members;/**/"
    }
}
