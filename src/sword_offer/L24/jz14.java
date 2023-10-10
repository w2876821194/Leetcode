//package sword_offer.L24;
//
//public class jz14 {
//}
//
//class klausur.L深信服.Solution {
//    public int cuttingRope(int n) {
//        if (n <= 3) {
//            return n - 1;
//        }
//        int l = n / 3;
//        int r = n % 3;
//
//        if (r == 0) {
//            return (int) Math.pow(3, l);
//        }
//        if (r == 1) {
//            return (int) (Math.pow(3, l - 1) * 4);
//        }
//        return (int) Math.pow(3, l) * 2;
//    }
//}
