package all.L1439;

import java.util.*;

class Solution {
    public int kthSmallest(int[][] mat, int k) {
        Queue<List<Integer>> queue = new ArrayDeque<>();
        Map<List<Integer>, Integer> map = new HashMap<>();
        PriorityQueue<Integer> Queue = new PriorityQueue<>();
        for (int i = 0; i < mat.length; i++) {
            if (i == 0) {
                for (int j = 0; j < mat[0].length; j++) {
                    List<Integer> list = new ArrayList<>();
                    list.add(mat[0][j]);
                    queue.add(list);
                    map.put(list, mat[0][j]);
                    if (mat.length == 1) {
                        Queue.add(mat[0][j]);
                    }
                }
            } else {
                boolean flag = i == mat.length - 1;
                int size = queue.size();
                for (int j = 0; j < size; j++) {
                    List<Integer> poll = queue.poll();
                    int sum = map.get(poll);
                    for (int p = 0; p < mat[0].length; p++) {
                        List<Integer> list = new ArrayList<>(poll);
                        list.add(mat[i][p]);
                        queue.add(list);
                        map.put(list, sum + mat[i][p]);
                        if (flag) {
                            Queue.add(sum + mat[i][p]);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < k; i++) {
            Integer poll = Queue.poll();
            if (i == k - 1) {
                if(poll != null) {
                    return poll;
                }
            }
        }
        return 0;
    }
}

class Test {
    public static void main(String[] args) {
        int[][] mat = {{1,10,10},{1,4,5},{2,3,6}};
        int k = 7;
        System.out.println(new Solution().kthSmallest(mat, k));
    }
}

// [[1,10,10]
// ,[1,4,5],
// [2,3,6]]


// 1,1,2
// 1,1,3,
// 1,4,2,
// 1,1,6
// 1,5,2
// 1,4,3
// 1,4,6
