package sword_offer.L13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class jz58 {
}

class Solution {
    public String reverseWords(String s) {
        List<String> list = Arrays.asList(s.split(" "));
        Collections.reverse(list);
        StringBuilder stringBuilder = new StringBuilder();
        list.stream()
                .filter(str -> !str.isEmpty())
                .forEach((i) -> stringBuilder.append(i.trim()).append(" "));
        return stringBuilder.toString().trim();
    }
}

class Test {
    public static void main(String[] args) {
        new Solution().reverseWords("a good   example");
    }
}
