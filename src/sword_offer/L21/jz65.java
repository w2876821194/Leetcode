//package sword_offer.L21;
//
//public class jz65 {
//}
//
//class Solution {
//    public int add(int a, int b) {
//        return gcd(a, b);
//    }
//
//    public int gcd(int a, int b) {
//        if (b != 0) {
//            int temp = (a & b) << 1;
//            a = a ^ b;
//            b = temp;
//            return gcd(a, b);
//        }
//        return a;
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        new Solution().add(2,2);
//    }
//}
////class Solution {
////    public int add(int a, int b) {
////        while (b != 0) {
////            int carry = (a & b) << 1;
////            a = a ^ b;
////            b = carry;
////        }
////        return a;
////    }
////}
