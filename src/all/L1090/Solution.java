package all.L1090;

import java.util.*;

class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        int len = values.length;
        int[][] arr = new int[len][2];
        for (int i = 0; i < len; i++) {
            arr[i][0] = values[i];
            arr[i][1] = labels[i];
        }

        Arrays.sort(arr, (o1, o2) -> o2[0]-o1[0]);
        // 值,键
        Map<Integer, List<Integer>> map = new HashMap<>();
        int num = 0,sum = 0;
        for (int[] p : arr) {
            if (!map.containsKey(p[1])) {
                List<Integer> list = new ArrayList<>();
                list.add(p[0]);
                map.put(p[1],list);
                num++;
                sum+=p[0];
            }else {
                if (map.get(p[1]).size() < useLimit) {
                    map.get(p[1]).add(p[0]);
                    num++;
                    sum+=p[0];
                }
            }

            if (num == numWanted)  {
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] values = {5,4,3,2,1}, labels = {1,1,2,2,3};
        int numWanted = 3, useLimit = 1;
        int i = new Solution().largestValsFromLabels(values, labels, numWanted, useLimit);
        System.out.println(i);
    }
}
