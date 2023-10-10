package all.L210;

import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] flags = new int[numCourses];
        List<List<Integer>> form = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        IntStream.range(0, numCourses)
                .forEach(i -> form.add(new ArrayList<>()));

        for (int[] p : prerequisites) {
            flags[p[1]]++;
            form.get(p[0]).add(p[1]);
        }

        IntStream.range(0, numCourses)
                .forEach(i -> {
                    if (flags[i] == 0) {
                        queue.add(i);
                        list.add(i);
                    }
                });

        while (!queue.isEmpty()) {
            int poll = queue.poll();
            numCourses--;
            form.get(poll).forEach(i -> {
                        flags[i]--;
                        if (flags[i] == 0) {
                            queue.add(i);
                            list.add(i);
                        }
                    }
            );
        }
        Collections.reverse(list);
        return numCourses == 0 ? list.stream().mapToInt(Integer::intValue).toArray() : new int[0];
    }
}
