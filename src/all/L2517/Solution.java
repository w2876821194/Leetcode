package all.L2517;

import java.util.*;

//class Solution {
//    public int maximumTastiness(int[] price, int k) {
//        Map<Integer, Set<Integer>> map = new HashMap<>();
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);
//        for (int i = 0; i < price.length; i++) {
//            for (int j = 0; j < price.length; j++) {
//                if (i == j) {
//                    continue;
//                }
//                int abs = Math.abs(price[i] - price[j]);
//                if (!map.containsKey(abs)) {
//                    Set<Integer> set = new HashSet<>();
//                    set.add(price[i]);
//                    set.add(price[j]);
//                    map.put(abs, set);
//                    priorityQueue.add(abs);
//                } else {
//                    map.get(abs).add(price[i]);
//                    map.get(abs).add(price[j]);
//                }
//            }
//        }
//        while (!priorityQueue.isEmpty()) {
//            if (map.get(priorityQueue.peek()).size() >= k) {
//                break;
//            } else {
//                priorityQueue.poll();
//            }
//        }
//        return priorityQueue.isEmpty() ? 0 : priorityQueue.poll();
//    }
//}
class Solution {
    public int maximumTastiness(int[] price, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);
        for (int p : price) {
            priorityQueue.add(p);
        }
        return 0;
    }
}


class Test {
    public static void main(String[] args) {
//        int[] price = new int[]{34, 116, 83, 15, 150, 56, 69, 42, 26};
//        int k = 6;
        int[] price = new int[]{13, 5, 1, 8, 21, 2};
        int k = 3;
        System.out.println(new Solution().maximumTastiness(price, k));
    }
}
