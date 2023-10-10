//package match.L113;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    List<List<Integer>> coordinates;
//    int k;
//    List<Integer> dp = new ArrayList<>();
//
//    public int countPairs(List<List<Integer>> coordinates, int k) {
//        this.coordinates = coordinates;
//        this.k = k;
//        int size = coordinates.size();
//
//        for (int i = 0; i < size; i++) {
//            dp.add(dp(i));
//        }
//        return dp.get(size - 1);
//    }
//
//    public int dp(int n) {
//        if (n == 0) {
//            return 0;
//        }
//
//        int num = dp.get(n - 1);
//        List<Integer> integers1 = coordinates.get(n);
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            List<Integer> integers2 = coordinates.get(i);
//            if ((integers1.get(0) ^ integers2.get(0)) + (integers1.get(1) ^ integers2.get(1)) == k) {
//                sum += 1;
//
//            }
//        }
//        return num + sum;
//    }
//}
