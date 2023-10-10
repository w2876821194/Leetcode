//package sword_offer.L31;
//
//public class jz14 {
//}
//
////class klausur.L深信服.Solution {
////    public int cuttingRope(int n) {
////        if (n <= 3) return n - 1;
////        int b = n % 3, p = 1000000007;
////        long rem = 1, x = 3;
////        for (int a = n / 3 - 1; a > 0; a /= 2) {
////            if (a % 2 == 1) rem = (rem * x) % p;
////            x = (x * x) % p;
////        }
////        if (b == 0) return (int) (rem * 3 % p);
////        if (b == 1) return (int) (rem * 4 % p);
////        return (int) (rem * 6 % p);
////    }
////}
//
//class Test {
//    public static void main(String[] args) {
//        new klausur.L深信服.Solution().cuttingRope(120);
//    }
//}
//
//class klausur.L深信服.Solution {
//    int mid = 1000000007;
//
//    public int cuttingRope(int n) {
//        if (n <= 3) {
//            return n - 1;
//        }
//        int d = n % 3;
//        int m = n / 3 - 1;
//        if (d == 0) {
//            return pow(3, m, 3);
//        } else if (d == 1) {
//            return pow(3, m, 4);
//        } else {
//            return pow(3, m, 6);
//        }
//    }
//
//    public int pow(long x, int y, int z) {
//        long sum = 1;
//        while (y != 0) {
//            if (y % 2 == 0) {
//                x = (x * x) % mid;
//                y /= 2;
//            } else {
//                sum = (sum * x) % mid;
//                y--;
//            }
//        }
//        return (int) ((sum * z) % mid);
//    }
//}
//
//
