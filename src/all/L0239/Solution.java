package all.L0239;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->b-a);
        int[] arr = new int[nums.length - k + 1];
        boolean[] flag = new boolean[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < k - 1) {
                queue.add(nums[i]);
                if (!map.containsKey(nums[i])) {
                    map.put(nums[i], 1);
                }else {
                    map.put(nums[i], map.get(nums[i]) + 1);
                }
            } else {
                queue.add(nums[i]);
                if (!map.containsKey(nums[i])) {
                    map.put(nums[i], 1);
                }else {
                    map.put(nums[i], map.get(nums[i]) + 1);
                }
                Integer poll;
                while (true) {
                    poll = queue.peek();
                    if (!map.containsKey(poll)) {
                        queue.poll();
                    }else {
                        break;
                    }
                }
                arr[j++] = poll;
                if (map.get(nums[j-1]) == 1) {
                    map.remove(nums[j-1]);
                }else {
                    map.put(nums[j-1],map.get(nums[j-1]) - 1);
                }
            }
        }
        return arr;
    }
}
class Test {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ints = new Solution().maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ints));
    }
}
