//package sword_offer.L13;
//
//public class jz21 {
//}
//class Solution {
//    public int[] exchange(int[] nums) {
//        int length = nums.length;
//        int[] arr = new int[length];
//        int l = 0;
//        int r = length - 1;
//
//        int index = 0;
//        while (index < length) {
//            if (nums[index] % 2 != 0) {
//                arr[l++] = nums[index];
//            } else {
//                arr[r--] = nums[index];
//            }
//            index++;
//        }
//        return arr;
//    }
//}
