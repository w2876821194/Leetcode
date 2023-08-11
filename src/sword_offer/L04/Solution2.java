//package sword_offer.L04;
//
//public class Solution2 {
//}
//
//class Solution1 {
//    int[] nums;
//    int target;
//
//    int num = 0;
//
//    public int search(int[] nums, int target) {
//        this.nums = nums;
//        this.target = target;
//        dichotomy(0, nums.length - 1);
//        return num;
//    }
//
//    public void dichotomy(int l, int r) {
//        if (l > r) {
//            return;
//        }
//        int m = (l + r) / 2;
//
//        if (target == nums[m]) {
//            num++;
//            int i = 1;
//            while ((m + i) < nums.length && nums[m + i++] == target) {
//                num++;
//            }
//            i = -1;
//            while ((m + i) > -1 && nums[m + i--] == target) {
//                num++;
//            }
//            return;
//        }
//
//        if (target > nums[m]) {
//            dichotomy(m + 1, r);
//        } else if (target < nums[m]) {
//            dichotomy(l, m - 1);
//        }
//
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        int[] nums = {5, 7, 7, 8, 8, 10};
//        new Solution1().search(nums, 8);
//    }
//}
