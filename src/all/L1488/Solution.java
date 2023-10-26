package all.L1488;

import java.util.*;
import java.util.stream.Collectors;

class Test {
    public static void main(String[] args) {
        int[] rains = {1, 0, 1, 0, 2, 0, 2};
//        int[] rains = {1, 0, 2, 0};
//        int[] rains = {1,2,0,0,2,1};
        new Solution().avoidFlood(rains);
    }
}

class Solution {
    public int[] avoidFlood(int[] rains) {
        int length = rains.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[length];
        TreeSet<Integer> list = new TreeSet<>();
        for (int i = 0; i < length; i++) {
            int num = rains[i];
            if (num != 0) {
                arr[i] = -1;
                if (map.containsKey(num)) {
                    if (!list.isEmpty()) {
                        Integer integer = map.get(num);
                        Integer integer1 = list.ceiling(integer);
                        if (integer1 != null) {
                            arr[integer1] = num;
                            list.remove(integer1);
                            map.put(num, i);
                        } else {
                            return new int[0];
                        }
                    } else {
                        return new int[0];
                    }
                } else {
                    map.put(num, i);
                }
            } else {
                list.add(i);
            }
        }
        list.forEach(i -> {
            arr[i] = 1;
        });
        return arr;
    }
}
