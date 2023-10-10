//package sword_offer.L31;
//
//public class jz44 {
//}
//
////class klausur.L深信服.Solution {
////    int n;
////    int start; // 以x开头数的字符串中的位数
////    int length; // 位数大小
////    int x; // 当前位数的开始数
////
////    public int findNthDigit(int n) {
////        if (n < 10) {
////            return n;
////        }
////        this.n = n;
////        gcd(9, 1, n);
////        int i = x + start / length; // 所在的数=(开头数+(在开头数区间的位数/位数)) + 1;
////        int j = start % length + 1;// 所在数的第几项 =  当前位数%位数大小
////        int k = length - j != 0 ? (length - j) * 10 : 1;
////        return i / k % 10;
////    }
////
////    // 开始数,位数,n
////    public void gcd(int x, int length, int n) {
////        if (n < x) {
////            this.length = length;
////            this.start = n;
////            this.x = x / length / 9;
////            return;
////        }
////        gcd(x * 10 * (length + 1), length + 1, n - x);
////    }
////}
//
//class Test {
//    public static void main(String[] args) {
////        System.out.println(new klausur.L深信服.Solution().findNthDigit(11));
////        System.out.println(new klausur.L深信服.Solution().findNthDigit(3));
////        System.out.println(new klausur.L深信服.Solution().findNthDigit(10));
//        System.out.println(new klausur.L深信服.Solution().findNthDigit(1000));
////        System.out.println(new klausur.L深信服.Solution().findNthDigit(20));
//    }
//}
//
//class klausur.L深信服.Solution {
//    public int findNthDigit(int n) {
//        int length = 1; // 位数
//        long start = 1; // 当前起始数
//        long x = 9; // 数位数量
//        while (n > x) { // n大于当前数位数量,说明不在当前数位数量区间
//            n -= x; // n-将当前数位个数
//            length += 1;    //位数+1
//            start *= 10;    //起始数*10
//            x = length * start * 9; // 当前起始数区间中的位数
//        }
//        long num = start + (n - 1) / length; // 所在数=开始数+所在区间的位置
//        int i = (n - 1) % length;   // 当前数的第几项
//        return Long.toString(num).charAt(i) - '0'; //所在数转字符串取出对应字符-'0'
//    }
//}
//
