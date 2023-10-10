//package sword_offer.L30;
//
//import java.util.Arrays;
//
//public class jz51 {
//}
//
////class klausur.L深信服.Solution {
////    int[] nums;
////    int sum = 0;
////    public int reversePairs(int[] nums) {
////        this.nums = nums;
////        gcd(nums.length - 1, new PriorityQueue<>());
////        return sum;
////    }
////    public void gcd(int i, Queue<Integer> queue) {
////        if (i == -1) {
////            return;
////        }
////        int num = nums[i];
////        Queue<Integer> integerQueue = new PriorityQueue<>(queue);
////        while (!integerQueue.isEmpty() && integerQueue.peek() < num) {
////            integerQueue.poll();
////            sum++;
////        }
////        queue.offer(num);
////        gcd(i - 1, queue);
////    }
////}
//
//class Test {
//    public static void main(String[] args) {
//        int[] nums = {7, 5, 6, 4};
//        new klausur.L深信服.Solution().reversePairs(nums);
//    }
//}
//
//class klausur.L深信服.Solution {
//    int[] nums;
//    int sum = 0;
//
//    public int reversePairs(int[] nums) {
//        this.nums = nums;
//        gcd(0, nums.length - 1);
//        System.out.println(Arrays.toString(nums));
//        return sum;
//    }
//    public void gcd(int l, int r) {
//        if (l >= r) {
//            return;
//        }
//        int m = (l + r) / 2;
//        gcd(l, m);
//        gcd(m + 1, r);
//        merge(l, m, r);
//    }
//    public void merge(int l, int m, int r) {
//        int[] temp = new int[r - l + 1];
//        int i = l;
//        int j = m + 1;
//        int t = 0;
//        while (i <= m && j <= r) {
//            if (nums[i] > nums[j]) {
////                [3,4,5] [2,6,7]
////                sum += 中间索引 - 左数组当前索引 + 1
////                例如此时中间索引是2[5],当前比较数是3[0]和2[3],因为3>2
////                所以左数组3及其之后的数一定大于右数组当前的数
////                所以用左子树的右索引-左子树当前索引+1就是右边这个数的逆序对数
//                sum += m - i + 1;
//                temp[t++] = nums[j++];
//            } else {
//                temp[t++] = nums[i++];
//            }
//        }
//        while (i <= m) {
//            temp[t++] = nums[i++];
//        }
//        while (j <= r) {
//            temp[t++] = nums[j++];
//        }
//        System.arraycopy(temp, 0, nums, l, temp.length);
//    }
//}
//
//
