package all.L207;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 领接表
        List<List<Integer>> form = new ArrayList<>();
        // 对应节点的前驱节点个数
        int[] flags = new int[numCourses];
        // BFS队列
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            form.add(new ArrayList<>());
        }
        // 前驱领接表
        IntStream.range(0, prerequisites.length)
                .forEach(i -> {
                    flags[prerequisites[i][0]]++;
                    form.get(prerequisites[i][1]).add(prerequisites[i][0]);
                });

        // 找到前驱节点为0到的节点,说明其作为开始
        IntStream.range(0, flags.length)
                .filter(i -> flags[i] == 0)
                .forEach(queue::add);

        // BFS
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            numCourses--;
            form.get(poll).forEach(i -> {
                        flags[i]--;
                        if (flags[i] == 0) {
                            queue.add(i);
                        }
                    }
            );
        }
        return numCourses == 0;
    }
}

class Test {
    public static void main(String[] args) {
        new Solution().canFinish(2, new int[][]{{0, 1}});
        new Solution1().canFinish(2, new int[][]{{0, 1}});
    }
}

class Solution1 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        List<List<Integer>> adjacency = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++)
            adjacency.add(new ArrayList<>());
        // Get the indegree and adjacency of every course.
        for (int[] cp : prerequisites) {
            indegrees[cp[0]]++;
            adjacency.get(cp[1]).add(cp[0]);
        }
        // Get all the courses with the indegree of 0.
        for (int i = 0; i < numCourses; i++)
            if (indegrees[i] == 0) queue.add(i);
        // BFS TopSort.
        while (!queue.isEmpty()) {
            int pre = queue.poll();
            numCourses--;
            for (int cur : adjacency.get(pre))
                if (--indegrees[cur] == 0) queue.add(cur);
        }
        return numCourses == 0;
    }
}
