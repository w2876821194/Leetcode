package all.L1377;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    Map<Integer, List<Integer>> map = new HashMap<>();
    int n;
    int[][] edges;
    int t;
    int target;
    List<Integer> list = new ArrayList<>();

    public double frogPosition(int n, int[][] edges, int t, int target) {
        if (edges.length == 0) {
            if (target == 1) {
                return 1;
            }
            return 0;
        }
        this.n = n;
        this.edges = edges;
        this.t = t;
        this.target = target;
        caret();
        bfs(1, 0, 1, new ArrayList<>());
        double sum = 0;
        for (Integer integer : list) {
            sum += (1.0 / integer);
        }
        return sum;
    }

    // root 步数 概率
    public void bfs(Integer root, int t, int n, List<Integer> l) {
        if (root == target && (t == this.t || (t < this.t && map.get(root).size() == 1 && root != 1))) {
            this.list.add(n);
            return;
        }

        if (t == this.t) {
            return;
        }
        List<Integer> list = map.get(root);
        int len = list.size();
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(l);
        list1.add(root);
        for (Integer integer : list) {
            if (!isEmpty(list1, integer)) {
                if (list1.size() == 1) {
                    bfs(integer, t + 1, n * len, list1);
                } else {
                    bfs(integer, t + 1, n * (len-1), list1);
                }
            }
        }
    }

    public void caret() {
        for (int[] r : edges) {
            if (!map.containsKey(r[0])) {
                map.put(r[0], new ArrayList<>());
            }
            if (!map.containsKey(r[1])) {
                map.put(r[1], new ArrayList<>());
            }
            map.get(r[0]).add(r[1]);
            map.get(r[1]).add(r[0]);
        }
    }

    public boolean isEmpty(List<Integer> list, int root) {
        for (Integer r : list) {
            if (r == root) {
                return true;
            }
        }
        return false;
    }
}

class Test {
    public static void main(String[] args) {
        int n = 4;
        int[][] edges = { {2,1}, {3,2}, {4,3} };
        int t = 2, target = 3;

//        int n = 7;
//        int[][] edges = { {1,2}, {1,3}, {1,7}, {2,4}, {2,6}, {3,5} };
//        int t = 20, target = 6; //0.16667
//        int n = 5;
//        int[][] edges = {{1, 5}, {1, 4}, {5, 3}, {3, 2}};
//        int t = 3, target = 2; //0.5
//        int n = 9;
//        int[][] edges = { {2,1}, {3,2}, {4,3}, {5,3}, {6,5}, {7,3}, {8,4}, {9,5} };
//        int t = 9, target = 1; //0.0

        System.out.println(new Solution().frogPosition(n, edges, t, target));
    }
}
//7
//[[1,2],[1,3],[1,7],[2,4],[2,6],[3,5]]
//20
//6

//5
//[[1,5],[1,4],[5,3],[3,2]]
//3
//2

//4
//[[2,1],[3,2],[4,3]]
//2
//3

//9
//[[2,1],[3,2],[4,3],[5,3],[6,5],[7,3],[8,4],[9,5]]
//9
//1

