package all.interview;

import java.util.*;

class Solution10 {
    private static List<Integer>[] picture;
    private static StringBuilder str;
    private static int[] sum;

    public static int[] countSubgraphsForEachDiameter(int n, int[][] edges) {
        picture = new List[n];
        Arrays.setAll(picture, p -> new ArrayList<>());
        for (int[] edge : edges) {
            picture[edge[0] - 1].add(edge[1] - 1);
            picture[edge[1] - 1].add(edge[0] - 1);
        }
        sum = new int[n - 1];

        for (int i = 1; i < 1 << n; i++) {
            if ((i&(i-1))==0) {
                continue;
            }
            str = new StringBuilder();
            int p = Integer.toBinaryString(i).length();
            while (p<n) {
                str.append("0");
                p++;
            }
            str.append(Integer.toBinaryString(i)).reverse();
            int num = bfs();
            if (num!= 0) {
                sum[num-1]++;
            }
        }
        return sum;
    }
    public static int bfs() {
        int y = 0;
        for (int x = 0; x < str.length()-1; x++) {
            int max = 0;
            if (str.toString().charAt(x) != '0') {
                Deque<Integer> q = new ArrayDeque<Integer>();
                q.offer(x);
                Set<Integer> list = new HashSet<>();
                list.add(x);
                max = -1;
                while (!q.isEmpty()) {
                    max++;
                    for (int i = q.size(); i > 0 ; i--) {
                        int z = q.poll();
                        for (int j = 0; j < picture[z].size(); j++) {
                            int index  = picture[z].get(j);
                            if ((index > str.toString().length()-1)) {
                                continue;
                            }
                            if (!list.contains(index) && str.toString().charAt(index)!='0') {
                                q.offer(index);
                                list.add(index);
                            }
                        }
                    }
                }
                if (list.size() != str.toString().replace("0","").length()) {
                    max =0;
                }
            }
            y = Math.max(y,max);
        }
        return y;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 3}, {1, 4}, {2, 3}};
        System.out.println(Arrays.toString(countSubgraphsForEachDiameter(4, a)));
        ;
    }
}


// 01 10     1000 0111
