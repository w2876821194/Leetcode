//package L359;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class L7006 {
//
//}
//
//class Solution {
//    public int maximizeTheProfit(int n, List<List<Integer>> offers) {
//        offers.sort((i, j) -> (j.get(2) - i.get(2)) + (i.get(1) - i.get(0)) - (j.get(1) - j.get(0)));
//        boolean[] flags = new boolean[n];
//        int sum = 0;
//        i:
//        for (List<Integer> offer : offers) {
//            for (int i = offer.get(0); i <= offer.get(1); i++) {
//                if (flags[i]) {
//                    continue i;
//                }
//            }
//            sum += offer.get(2);
//            Arrays.fill(flags, offer.get(0), offer.get(1) + 1, true);
//        }
//        return sum;
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        List<List<Integer>> list = new ArrayList<>();
////        int[][] arr = new int[][]{{1, 3, 9}, {0, 2, 10}, {1, 3, 3}, {0, 1, 3}, {2, 2, 1}, {3, 3, 7}, {2, 2, 1}, {1, 2, 9}, {1, 2, 8}};
//        int[][] arr = new int[][]{{0, 6, 5}, {2, 9, 4}, {0, 9, 2}, {3, 9, 3}, {1, 6, 10}, {0, 1, 3}, {3, 8, 9}, {4, 8, 3}, {2, 6, 5}, {0, 4, 6}};
//
//        for (int[] row : arr) {
//            List<Integer> intList = new ArrayList<>();
//            for (int element : row) {
//                intList.add(element); // 将元素添加到intList中
//            }
//            list.add(intList); // 将intList添加到resultList中
//        }
//        new Solution().maximizeTheProfit(4, list);
//    }
//}
