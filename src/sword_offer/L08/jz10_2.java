//package sword_offer.L08;
//
//public class jz10_2 {
//}
//
//class Solution {
//    int[] arr = new int[101];
//
//    public int numWays(int n) {
//        return recursion(n);
//    }
//
//    public int recursion(int n) {
//        if (n == 0 || n == 1) {
//            arr[0] = 1;
//            arr[1] = 1;
//            return 1;
//        }
//        if (n == 2) {
//            arr[2] = 2;
//            return 2;
//        }
//        if (arr[n] == 0) {
//            arr[n] = (recursion(n - 1) % 1000000007 + recursion(n - 2) % 1000000007) % 1000000007;
//        }
//        return arr[n];
//    }
//}
