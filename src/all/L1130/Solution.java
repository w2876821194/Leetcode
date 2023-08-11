package all.L1130;

import java.util.Stack;

class Solution {
    public int mctFromLeafValues(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        stack.add(Integer.MAX_VALUE);
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] >= stack.peek()) {
                Integer poll = stack.pop();
                sum += poll * Math.min(arr[i], stack.peek());
            }
            stack.add(arr[i]);
        }
        while (stack.size() > 2) {
            sum += stack.pop() * stack.peek();
        }
        return sum;
    }
}

class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{15, 13, 5, 3, 15};

        System.out.println(new Solution().mctFromLeafValues(arr));
    }
}
