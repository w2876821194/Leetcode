//package sword_offer.L20;
//
//public class jz16 {
//}
//
//class Solution {
//    public double myPow(double x, int n) {
//        if (n == 0) {
//            return 1;
//        }
//        if (x == 1.0) {
//            return x;
//        }
//        if (x == -1) {
//            if (n % 2 == 0) {
//                return x * -1;
//            }
//            return x;
//        }
//        double sum = 1;
//        boolean flag = false;
//        if (n < 0) {
//            if (n == Integer.MIN_VALUE) {
//                return 0;
//            }
//            flag = true;
//            n *= -1;
//        }
//        while (n > 1) {
//            if (n % 2 == 0) {
//                x = x * x;
//                n = n / 2;
//            } else {
//                sum *= x;
//                n--;
//            }
//        }
//        if (flag) {
//            return 1 / (sum * x);
//        }
//        return sum * x;
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        double x = 2.00000;
//        int n = -2;
//        new Solution().myPow(x, n);
//    }
//}
