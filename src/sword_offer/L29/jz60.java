//package sword_offer.L29;
//
//import java.util.Arrays;
//
//public class jz60 {
//}
//
//class klausur.L深信服.Solution {
//
//    public double[] dicesProbability(int n) {
//        return gcd(n);
//    }
//
//    public double[] gcd(int n) {
//        if (n == 1) {
//            double[] arr = new double[6];
//            Arrays.fill(arr, 1.0 / 6);
//            return arr;
//        }
//        double[] gcd = gcd(n - 1);
//        int len = 5 * n + 1;
//        double[] arr = new double[len];
//        for (int i = 0; i < gcd.length; i++) {
//            for (int j = i; j < i + 6; j++) {
//                arr[j] += gcd[i] / 6.0;
//            }
//        }
//        return arr;
//    }
//}
