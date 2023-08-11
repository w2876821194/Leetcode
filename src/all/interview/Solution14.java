package all.interview;

import java.util.*;

class Solution14 {
    public static int maximalNetworkRank(int n, int[][] roads) {
        int[][] flag = new int[n][n];
        int[] sum = new int[n];
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        int max1 = 0,max2 = 0;
        for (int i = 0; i < roads.length; i++) {
            int x = roads[i][0];
            int y = roads[i][1];
            flag[x][y] = 1;
            flag[y][x] = 1;
            sum[x] ++;
            sum[y] ++;
        }
        for (int i = 0; i < n; i++) {
            if (sum[i] > max1) {
                second = new ArrayList<>(first);
                first.clear();
                first.add(i);
                max2 = max1;
                max1 = sum[i];
            } else if (sum[i] == max1) {
                first.add(i);
            }else if (sum[i] > max2) {
                second.clear();
                second.add(i);
                max2 = sum[i];
            } else if (sum[i] == max2) {
                second.add(i);
            }
        }

        if (first.size() == 1) {
            int j = first.get(0);
            for (int i = 0; i < second.size(); i++) {
                if (flag[second.get(i)][j] == 0) {
                    return sum[second.get(i)] +sum[j];
                }
            }
            return max1 + max2 -1;
        }else {
            for (int i = 0; i < first.size() ; i++) {
                for (int j = i+1; j < first.size(); j++) {
                    if (flag[first.get(i)][first.get(j)] == 0) {
                        return max1*2;
                    }
                }
            }
            return max1*2-1;
        }
    }

    public static void main(String[] args) {
//        int n = 8;
//        int[][] roads = {{0,1},{1,2},{2,3},{2,4},{5,6},{5,7}};
//        int n = 5;
//        int[][] roads = {{0,1},{1,2},{0,3},{1,3},{2,3},{2,4}};
        int n = 8;
        int[][] roads = {{4,6},{5,2},{3,5},{7,5},{7,6}};
        System.out.println(maximalNetworkRank(n,roads));
    }
}


// 01 10     1000 0111
