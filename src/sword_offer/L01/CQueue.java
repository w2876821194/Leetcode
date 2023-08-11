package sword_offer.L01;

import java.util.Stack;

class CQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1 == null || stack1.size() == 0) {
            return -1;
        }
        pushAll(stack2, stack1);
        Integer pop = stack2.pop();
        pushAll(stack1, stack2);
        return pop;
    }

    public <T> void pushAll(Stack<T> stack1, Stack<T> stack2) {
        stack1.setSize(0);
        while (stack2.size() != 0) {
            stack1.push(stack2.pop());
        }
    }
}


/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
