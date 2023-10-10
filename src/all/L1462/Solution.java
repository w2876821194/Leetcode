package all.L1462;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {
    Map<Integer, Set<Integer>> map = new HashMap<>();
    Map<Integer, Set<Integer>> mapFind = new HashMap<>();

    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        IntStream.range(0, numCourses)
                .forEach(i -> map.put(i, new HashSet<>()));

        Arrays.stream(prerequisites).forEach(ints -> {
            int x = ints[0];
            int y = ints[1];
            map.get(y).add(x);
        });

        return Arrays.stream(queries)
                .map(ints -> gcd(ints[1]).stream()
                        .anyMatch(integer -> ints[0] == integer)
                )
                .collect(Collectors.toList());
    }

    public Set<Integer> gcd(Integer integer) {
        if (mapFind.get(integer) != null) {
            return mapFind.get(integer);
        }
        Set<Integer> set = new HashSet<>();

        map.get(integer).forEach(i -> {
                    set.add(i);
                    set.addAll(gcd(i));
                }
        );
        mapFind.put(integer, set);
        return set;
    }
}

class Test {
    public static void main(String[] args) {
        int numCourses = 5;
        int[][] prerequisites = {{3, 4}, {2, 3}, {1, 2}, {0, 1}};
        int[][] queries = {{0, 4}, {4, 0}, {1, 3}, {3, 0}};
        new Solution().checkIfPrerequisite(numCourses, prerequisites, queries);
    }
}
