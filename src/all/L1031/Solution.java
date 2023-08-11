package all.L1031;

class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int[] first = new int[nums.length+1];
        for (int i = 0; i < first.length; i++) {
            first[i] = i==0?0:first[i-1]+nums[i-1];
        }
        System.out.println();


        int maxNum = 0;
        int n = nums.length;
        for (int i = 0; i+firstLen <= n; i++) {
            int i1 = first[i + firstLen] - first[i];
            for (int j = i+firstLen; j+secondLen<=n; j++) {
                int i2 = first[j + secondLen] - first[j];
                maxNum = Math.max(maxNum,i1+i2);
            }
            for (int j = 0;j + secondLen<=i; j++) {
                int i2 = first[j + secondLen] - first[j];
                maxNum = Math.max(maxNum,i1+i2);
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
//        int[] nums = {2,1,5,6,0,9,5,0,3,8};
//        int firstLen = 4, secondLen = 3;
//        int[] nums = {0,6,5,2,2,5,1,9,4};
//        int firstLen = 1, secondLen = 2;
        int[] nums = {12,8,12,18,19,10,17,20,6,8,13,1,19,11,5};
        int firstLen = 3, secondLen = 6;

        Solution solution = new Solution();
        solution.maxSumTwoNoOverlap(nums,firstLen,secondLen);
    }
}
