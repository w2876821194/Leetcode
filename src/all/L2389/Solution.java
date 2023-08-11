package all.L2389;

import java.util.*;

public class Solution {
    public static int[] answerQueries(int[] nums, int[] queries) {
        int [] firstArray = new int[nums.length];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                firstArray[i] = nums[i];
                continue;
            }
            firstArray[i] = firstArray[i-1] + nums[i];
        }

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int j = search(firstArray,queries[i]);
//            if (j == 0 || j== -1) {
//                continue;
//            }
            if (firstArray[j] <= queries[i]) {
                answer[i] = j+1;
            }else {
                answer[i] = j;
            }
        }
        return answer;
    }
    public static int search(int[] array, int target) {
        //最小索引指针
        int min = 0;
        int max = array.length - 1;
        int mid = -1;
        while (min < max) {
            //算出平均索引位置
            mid = (min + max) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                min = mid + 1;
            }
            if (array[mid] > target) {
                max = mid - 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5}, queries = {1};
//        int[] nums = {4,5,2,1}, queries = {3,10,21};
        System.out.println(Arrays.toString(answerQueries(nums, queries)));
    }
}
