//package sword_offer.L24;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class jz57 {
//}
//
////class Solution {
////    List<List<Integer>> arrayList = new ArrayList<>();
////
////    public int[][] findContinuousSequence(int target) {
////        if (target < 2) {
////            return new int[0][0];
////        }
////
////        if (target % 2 != 0) {
////            List<Integer> list = new ArrayList<>();
////            list.add(target / 2);
////            list.add(target / 2 + 1);
////            arrayList.add(list);
////        }
////
////        for (int i = 3; i < target / 2; i++) {
////            if (target % i == 0) {
////                List<Integer> list = new ArrayList<>();
////                int k = target / i - (i / 2);
////                for (int j = 0; j < i; j++) {
////                    list.add(k + j);
////                }
////                arrayList.add(list);
////            }
////        }
////        int[][] arr = new int[arrayList.size()][];
////        int size = arrayList.size();
////        for (int i = 0; i < size; i++) {
////            List<Integer> list = arrayList.get(size - 1 - i);
////            arr[i] = new int[list.size()];
////            for (int j = 0; j < list.size(); j++) {
////                arr[i][j] = list.get(j);
////            }
////        }
////        return arr;
////    }
////}
//
//class Test {
//    public static void main(String[] args) {
//        new Solution().findContinuousSequence(15);
//    }
//}
//
//class Solution {
//    List<List<Integer>> arrayList = new ArrayList<>();
//
//    public int[][] findContinuousSequence(int target) {
//        int l = 1;
//        int r = 1;
//        int sum = 1;
//        while (r <= target / 2 + 1) {
//            while (sum + r + 1 <= target) {
//                sum += r + 1;
//                r++;
//            }
//            while (sum > target) {
//                sum -= l;
//                l++;
//            }
//            if (sum == target) {
//                List<Integer> list = new ArrayList<>();
//                for (int i = l; i <= r; i++) {
//                    list.add(i);
//                }
//                arrayList.add(list);
//            }
//            r++;
//            sum += r;
//        }
//
//        int[][] arr = new int[arrayList.size()][];
//        int size = arrayList.size();
//        for (int i = 0; i < size; i++) {
//            List<Integer> list = arrayList.get(i);
//            arr[i] = new int[list.size()];
//            for (int j = 0; j < list.size(); j++) {
//                arr[i][j] = list.get(j);
//            }
//        }
//        return arr;
//    }
//}
