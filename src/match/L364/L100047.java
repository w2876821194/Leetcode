//package match.L364;
//
//import java.util.*;
//
//class Solution {
//    Map<Integer, Set<Integer>> map = new HashMap<>();
//    Map<Integer, Set<Integer>> set = new HashMap<>();
//    int[] flag = new int[100000];
//
//    public long countPaths(int n, int[][] edges) {
//        Arrays.stream(edges).forEach(i -> {
//            Set<Integer> orDefault1 = map.getOrDefault(i[0], new HashSet<>());
//            orDefault1.add(i[1]);
//            map.put(i[0], orDefault1);
//
//            Set<Integer> orDefault2 = map.getOrDefault(i[1], new HashSet<>());
//            orDefault2.add(i[0]);
//            map.put(i[1], orDefault2);
//        });
//
//        for (int i = 1; i < 100000; i++) {
//            for (int j = 2 * i; j < 100000; j = j * 2) {
//                flag[j] = 1;
//            }
//        }
//        Queue<Integer> queue = new ArrayDeque<>();
//
//        for (int i = 1; i <= n; i++) {
//            if (flag[i] == 0) {
//                queue.add(i);
//            }
//        }
//
//        while (!queue.isEmpty()) {
//            Integer poll = queue.poll();
//            Set<Integer> set = new HashSet<>();
//            for (Integer i :search(poll)){
//
//            }
//
//
//        }
//    }
//
//    private Set<Integer> search(Integer root) {
//        if (set.containsKey(root)) {
//            return this.set.get(root);
//        }
//        Set<Integer> set = new HashSet<>();
//        for (Integer i : map.get(root)) {
//            if (flag[i] == 0) {
//                set.add(i);
//                set.addAll(search(i));
//            }
//        }
//        this.set.put(root, set);
//        return this.set.get(root);
//    }
//}
