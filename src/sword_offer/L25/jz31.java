//package sword_offer.L25;
//
//import java.util.*;
//
//public class jz31 {
//}
//
//class Solution {
//    boolean flag;
//    Stack<Integer> stack;
//    int[] pushed;
//    int[] popped;
//
//    public boolean validateStackSequences(int[] pushed, int[] popped) {
//        this.pushed = pushed;
//        this.popped = popped;
//        stack = new Stack<>();
//        gcd(0, 0);
//        return !flag;
//    }
//    public void gcd(int p, int q) {
//        if (q == popped.length) {
//            return;
//        }
//        while (p != popped.length && (stack.size() == 0 || stack.peek() != popped[q])) {
//            stack.push(pushed[p]);
//            p++;
//        }
//        if (stack.peek() == popped[q]) {
//            stack.pop();
//            q++;
//            gcd(p, q);
//        } else {
//            flag = true;
//        }
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
////        int[] pushed = {1, 2, 3, 4, 5}, popped = {4, 5, 3, 2, 1};
//        int[] pushed = {1, 2, 3, 4, 5}, popped = {4, 3, 5, 1, 2};
//        new Solution().validateStackSequences(pushed, popped);
//    }
//}
