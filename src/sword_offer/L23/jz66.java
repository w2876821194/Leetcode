//package sword_offer.L23;
//
//public class jz66 {
//}
//
//class klausur.L深信服.Solution {
//    public int[] constructArr(int[] a) {
//        if (a.length == 0) {
//            return new int[0];
//        }
//        int[] arr = new int[a.length];
//        arr[0] = 1;
//        int[] arr1 = new int[a.length];
//        arr1[a.length - 1] = 1;
//        for (int i = 1; i < a.length; i++) {
//            arr[i] = a[i - 1] * arr[i - 1];
//        }
//        for (int i = a.length - 2; i >= 0; i--) {
//            arr1[i] = a[i + 1] * arr1[i + 1];
//            arr[i] *= arr1[i];
//        }
//        return arr;
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
//        new klausur.L深信服.Solution().constructArr(a);
//    }
//}
