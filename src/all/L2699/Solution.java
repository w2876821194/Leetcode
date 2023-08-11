package all.L2699;

import java.util.*;

class Solution {
    int n; // 数量
    int[][] edges; // 图
    int source; // 起点
    int destination; // 终点
    int target; // 权值
    int[][] flags; // 邻接矩阵
    Map<Integer, List<Integer>> map; // 领接表
    Map<List<Integer>, List<Integer>> list = new HashMap<>(); //路径及和

    public int[][] modifiedGraphEdges(int n, int[][] edges, int source, int destination, int target) {
        this.n = n;
        this.edges = edges;
        this.source = source;
        this.destination = destination;
        this.target = target;
        build1();
        build2();
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        dfs(list, source, set, 0, 0);
        boolean search = search();
        if (!search) {
            return new int[][]{};
        }
        update();
        return edges;


    }

    private void update() {
        for (int i = 0; i < edges.length; i++) {
            if (flags[edges[i][0]][edges[i][1]] != edges[i][2]) {
                edges[i][2] = flags[edges[i][0]][edges[i][1]];
            }
            if (flags[edges[i][0]][edges[i][1]] == -1) {
                edges[i][2] = 1;
            }
        }
    }

    private boolean search() {
        for (List<Integer> integers : this.list.keySet()) {
            List<Integer> list = this.list.get(integers);
            if (list.get(0) < target && list.get(1) == 0) {
                return false;
            }
            // 最小补1<=目标数&&最大补10^7>=目标数
            if (list.get(0) + 2 * list.get(1) <= target && list.get(0) + list.get(1) + list.get(1) * Math.pow(10, 7) >= target) {
                int max = (target - list.get(0) - list.get(1)) / list.get(1);
                int sum = list.get(0) + list.get(1);
                boolean flag = false;
                int num = 0;
                for (int i = 1; i < integers.size(); i++) {
                    if (flags[integers.get(i - 1)][integers.get(i)] == -1) {
                        flags[integers.get(i - 1)][integers.get(i)] = max;
                        flags[integers.get(i)][integers.get(i - 1)] = max;
                        sum += max;
                        num++;
                        if (num == list.get(1)) {
                            flag = true;
                        }

                    } else {
                        sum += flags[list.get(i)][list.get(i - 1)];
                    }

                    if (flag) {
                        if (sum != target) {
                            flags[integers.get(i - 1)][integers.get(i)] = target - sum + max;
                            flags[integers.get(i)][integers.get(i - 1)] = target - sum + max;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void build1() {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] i : edges) {
            if (!map.containsKey(i[0])) {
                List<Integer> list = new ArrayList<>();
                list.add(i[1]);
                map.put(i[0], list);
            } else {
                map.get(i[0]).add(i[1]);
            }

            if (!map.containsKey(i[1])) {
                List<Integer> list = new ArrayList<>();
                list.add(i[0]);
                map.put(i[1], list);
            } else {
                map.get(i[1]).add(i[0]);
            }
        }
        this.map = map;
    }

    public void build2() {
        int[][] flags = new int[n][n];
        for (int[] a : edges) {
            flags[a[0]][a[1]] = a[2];
            flags[a[1]][a[0]] = a[2];
        }
        this.flags = flags;
    }

    // 路径点数,当前位置,走过点数,路径和,-1的个数
    public void dfs(List<Integer> list, int index, Set<Integer> set, int num, int flag) {
        list.add(index);
        set.add(index);
        if (index == destination) {
            List<Integer> list1 = new ArrayList<>();
            list1.add(num);
            list1.add(flag);
            this.list.put(list, list1);
            return;
        }
        for (Integer i : map.get(index)) {
            if (!set.contains(i)) {
                List<Integer> list1 = new ArrayList<>();
                list1.addAll(list);
                Set<Integer> set1 = new HashSet<>();
                set1.addAll(set);
                dfs(list1, i, set1, num + flags[index][i], flag + (flags[index][i] == -1 ? 1 : 0));
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
//        int n = 5, source = 0, destination = 1, target = 5;
//        int[][] edges = {{4, 1, -1}, {2, 0, -1}, {0, 3, -1}, {4, 3, -1}};
        int n = 4, source = 2, destination = 3, target = 8;
        int[][] edges = {{0, 1, -1}, {1, 2, -1}, {3, 1, -1}, {3, 0, 2}, {0, 2, 5}};
        new Solution().modifiedGraphEdges(n, edges, source, destination, target);

    }
}
