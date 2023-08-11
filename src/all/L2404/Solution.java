package all.L2404;

public class Solution {
    public static int mostFrequentEven(int[] nums) {
        int[] array = new int[50001];
        int maxNum = 0;
        int maxIndex = -1;
        for (int num : nums) {
            if (num % 2 == 0) {
                array[num / 2]++;
                if (array[num / 2] > maxNum) {
                    maxNum = array[num / 2];
                    maxIndex = num;
                } else if (array[num / 2] == maxNum) {
                    maxIndex = Math.min(num, maxIndex);
                }
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
//        int[] num = {29,47,21,41,13,37,25,7};
        int[] num = {0, 1, 2, 2, 4, 4, 1};
//        int[] num = {4,4,4,9,2,4};
        System.out.println(mostFrequentEven(num));
    }
}
