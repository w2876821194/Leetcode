//package match.L361;
//
//import java.util.Arrays;
//
//public class L1 {
//}
//
//class klausur.L深信服.Solution {
//    public int countSymmetricIntegers(int low, int high) {
//        int num = 0;
//        for (int i = low; i <= high; i++) {
//            String n = Integer.toString(i);
//            if (n.length() % 2 == 0) {
//                String s1 = n.substring(0, n.length() / 2);
//                String s2 = n.substring(n.length() / 2);
//                long n1 = Arrays.stream(s1.split("")).mapToLong(Long::parseLong).sum();
//                long n2 = Arrays.stream(s2.split("")).mapToLong(Long::parseLong).sum();
//                if (n1 == n2) {
//                    num++;
//                }
//            }
//        }
//        return num;
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        new klausur.L深信服.Solution().countSymmetricIntegers(1,100);
//    }
//}
