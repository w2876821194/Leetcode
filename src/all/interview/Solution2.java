package all.interview;

public class Solution2 {
//    public static int countTriplets(int[] nums) {
//        int[] result = new int[1 << 16];
//        int sum = 0, max = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                int num = nums[i] & nums[j];
//                if (num > max) {
//                    max = num;
//                }
//                result[num]++;
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j <= max; j++) {
//                if (result[j] == 0) {
//                    continue;
//                }
//                if ((nums[i] & j) == 0) {
//                    sum += result[j];
//                }
//            }
//        }
//        return sum;
//    }

            public static int countTriplets(int[] nums) {
                int sum = 0;
                for (int i = 0; i < nums.length; i++) {
                    for (int j = 0; j < nums.length && j >= i; j++) {
                        System.out.println("");
                    }
                }
                return sum;
            }


    public static void main(String[] args) {
        int[] nums = {0};
        int[] nums1 = {2, 1, 3};
        System.out.println(countTriplets(nums1));
//        System.out.println(countTriplet(nums));
    }


    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    System.out.print(a[i] + a[j] + a[k] + "");
                }
            }
        }
        System.out.println();
    }
// 0,1
//    0,0,0  0,0,1  0,1,0  0,1,1
// 8
//    0,0,0  0,0,1  0,1,0  0,1,1  1,0,0  1,0,1  1,1,0  1,1,1
//


// 213
//    222 221(3) 223 211(3) 213(6)
//    111 113 133
//    333

//    221 211

//21? 6*

    //(i=0, j=0, k=1) : 2 & 2 & 1#   4
    //(i=0, j=1, k=0) : 2 & 1 & 2#   5
    //(i=0, j=1, k=1) : 2 & 1 & 1#   3
    //(i=0, j=1, k=2) : 2 & 1 & 3   7  *
    //(i=0, j=2, k=1) : 2 & 3 & 1   8  *

    //(i=1, j=0, k=0) : 1 & 2 & 2#   6
    //(i=1, j=0, k=1) : 1 & 2 & 1#   2
    //(i=1, j=0, k=2) : 1 & 2 & 3   9  *
    //(i=1, j=1, k=0) : 1 & 1 & 2#   1
    //(i=1, j=2, k=0) : 1 & 3 & 2   10 *
    //(i=2, j=0, k=1) : 3 & 2 & 1   11 *
    //(i=2, j=1, k=0) : 3 & 1 & 2   12 *
    // 12=6(全不同)+6(12)+6(13)+6(23)
    //
    // 27=6(全不同)+6(0,0) +6(0,0) +6(0,0)


    // 123 132 213 231 321 312
    // 112 121 211 122 212 221
    // 113 131 311 133 313 331
    // 111 111 111 111 111 111
    //
}
