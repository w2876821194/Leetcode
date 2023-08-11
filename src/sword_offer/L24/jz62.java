//package sword_offer.L24;
//
//public class jz62 {
//}
//
////class Solution {
////    public int lastRemaining(int n, int m) {
////        Set<Integer> set = new HashSet<>();
////        int i = 0;
////        int j = 1;
////        while (set.size() != n) {
////            if (i == n) {
////                i = 0;
////            }
////            if (set.contains(i)) {
////                i++;
////                continue;
////            }
////            if (j == m) {
////                set.add(i);
////                j = 0;
////            }
////            i++;
////            j++;
////        }
////        return i - 1;
////    }
////}
//// 3
//// 2,0,4,1,3
//
//class Test {
//    public static void main(String[] args) {
//        new Solution().lastRemaining(5, 3);
//    }
//}
//
////class Solution {
////    public int lastRemaining(int n, int m) {
////        int f = 0;
////        for (int i = 2; i != n + 1; i++) {
////            f = (m + f) % i;
////        }
////        return f;
////    }
////} // 1 1
//class Solution {
//    public int lastRemaining(int n, int m) {
//        return f(n, m);
//    }
//
//    public int f(int n, int m) {
//        if (n == 1) {
//            return 0;
//        }
//        int x = f(n - 1, m);
//        return (m + x) % n;
//    }
//}
//// 5,3-->(3+0)/5 === 2
//// 4,3-->(3+1)/4 === 0
//// 3,3-->(3+1)/3 === 1
//// 2,3-->(3+0)/2 === 1
//// 1,3-->0
