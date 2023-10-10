package klausur.数字马力;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class Solution3 {
}

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param A   int整型ArrayList
     * @param n   int整型
     * @param sum int整型
     * @return long长整型
     */
    public long countPairs(ArrayList<Integer> A, int n, int sum) {
        // write code here
        AtomicLong m = new AtomicLong(0);
        Map<Integer, Integer> map = new HashMap<>();
        A.forEach(i -> map.put(i, map.getOrDefault(i, 0) + 1));


        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            int i = sum - integerIntegerEntry.getKey();
            int j = integerIntegerEntry.getKey();
            if (map.containsKey(i)) {
                if (i == j) {
                    m.getAndAdd((long) map.get(j) * (map.get(j) - 1));
                } else {
                    m.getAndAdd((long) integerIntegerEntry.getValue() * map.get(i));
                }
            }
        }
        return m.get() / 2;
    }
}
