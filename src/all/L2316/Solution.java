package all.L2316;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

class Solution {
    Map<Integer, Set<Integer>> map = new HashMap<>();

    public long countPairs(int n, int[][] edges) {
        IntStream.range(0, n)
                .forEach(i -> map.put(i, new HashSet<>()));

        IntStream.range(0, edges.length)
                .forEach(i -> {
                    Set<Integer> orDefault0 = map.get(edges[i][0]);
                    orDefault0.add(edges[i][1]);
                    Set<Integer> orDefault1 = map.get(edges[i][1]);
                    orDefault1.add(edges[i][0]);
                });
        AtomicLong sum = new AtomicLong((long) n * n);
        IntStream.range(0, n)
                .forEach(i -> {
                    map.put(i, gcd(i, new HashSet<>()));
                    if (map.get(i).isEmpty()) {
                        map.get(i).add(i);
                    }
                    sum.addAndGet(-map.get(i).size());
                });
        return sum.get();
    }

    public Set<Integer> gcd(Integer x, Set<Integer> flag) {
        flag.add(x);
        Set<Integer> set = new HashSet<>(map.get(x));
        for (Integer integer : map.get(x)) {
            if (!flag.contains(integer)) {
                set.addAll(gcd(integer, flag));
            }
        }
        return set;
    }
}

class Test {
    public static void main(String[] args) {
//        int n = 3;
//        int[][] edges = {{0, 1}, {0, 2}, {1, 2}};
        int n = 7;
        int[][] edges = {{0, 2}, {0, 5}, {2, 4}, {1, 6}, {5, 4}};
        new Solution().countPairs(n, edges);
    }
}
