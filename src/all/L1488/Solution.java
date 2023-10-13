package all.L1488;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] avoidFlood(int[] rains) {
        int[] arr = new int[rains.length];
        Queue<Integer[]> queue = new PriorityQueue<>(Comparator.comparingInt(i -> i[0]));
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] != 0) {
                queue.add(new Integer[]{i, rains[i]});
                arr[i] = -1;
            } else {
                arr[i] = 1;
            }
        }

        for (int i = 0; i < rains.length; i++) {
            if (rains[i] != 0) {
                if (set.contains(rains[i])) {
                    return new int[0];
                } else {
                    set.add(rains[i]);
                    queue.poll();
                }
            } else {
                // 处理最先会来雨的水库
                if (!set.isEmpty()) {
                    List<Integer[]> list = new ArrayList<>();
                    while (!queue.isEmpty() && !set.contains(queue.peek()[1])) {
                        list.add(queue.poll());
                    }
                    if (queue.peek() != null) {
                        arr[i] = queue.peek()[1];
                        set.remove(queue.peek()[1]);
                    }
                    queue.addAll(list);
                } else {
                    arr[i] = 1;
                }
            }
        }
        return arr;
    }
}

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
