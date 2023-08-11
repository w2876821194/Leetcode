package all.L739;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr = new int[temperatures.length];
        Deque<Integer> stark = new LinkedList<>();

        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            while (!stark.isEmpty() && temp > temperatures[stark.peek()]) {
                Integer poll = stark.poll();
                arr[poll] = i - poll;
            }
            stark.push(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        new Solution().dailyTemperatures(temperatures);
    }
}
