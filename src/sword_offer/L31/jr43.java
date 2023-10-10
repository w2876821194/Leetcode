//package sword_offer.L31;
//
//public class jr43 {
//}
//
//class klausur.L深信服.Solution {
//    public int countDigitOne(int n) {
//        // 定义当前值
//        int m = n % 10;
//        // 定义左值
//        int l = n / 10;
//        // 定义右值
//        int r = 0;
//        // 定义1的数量
//        int sum = 0;
//        // 进制位
//        int o = 1;
//        while (l != 0 || m != 0) {
//            if (m == 0) {
//                // 当前值等于0
//                sum += l * o;
//            } else if (m == 1) {
//                // 当前值等于1
//                sum += l * o + r + 1;
//            } else {
//                //  当前值等于2~9
//                sum += (l + 1) * o;
//            }
//            // 下一位数据信息
//            r += m * o;
//            m = l % 10;
//            l = l / 10;
//            o *= 10;
//        }
//        return sum;
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        new klausur.L深信服.Solution().countDigitOne(12);
//    }
//}
//
