//package L359;
//
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//
//public class L6450 {
//}
//
////  [1,2,4,5,6]
////  [1,2,3,4,5]
////class Solution {
////    public int minimumSum(int n, int k) {
////        Set<Integer> set = new HashSet<>();
////        for (int i = 1; i <= k / 2; i++) {
////            set.add(i);
////            set.add(k - i);
////        }
////        int sum = 0;
////        int j = 1;
////        for (int i = 1; i <= n; i++) {
////            if (!set.contains(i)) {
////                sum += j;
////            }
////            j++;
////
////        }
////        return sum;
////    }
////}
//class Test {
//    public static void main(String[] args) {
//        // 2 3
//        // 4
//        // 1 2
//        // 3 6
//        // 6
//        // 1 2 3
//        new Solution().minimumSum(5, 4);
//    }
//}
//
//class Solution {
//    public int minimumSum(int n, int k) {
//        Set<Integer> set = new HashSet<>();
//        Set<Integer> flags = new HashSet<>();
//        int sum = 0;
//        int j = 1;
//        for (int i = 1; i <= n; i++) {
//            if (!set.contains(k - j)) {
//                sum += j;
//                set.add(j);
//            } else {
//                i--;
//            }
//            j++;
//        }
//        return sum;
//    }
//}
