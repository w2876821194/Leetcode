package sword_offer.L01;

class MinStack {

    int index;
    int[] values;

    int min;


    /**
     * initialize your data structure here.
     */
    public MinStack() {
        values = new int[2000];
        index = 0;
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        values[index++] = x;
        updateMin(x);
    }

    public void pop() {
        if (min == values[index - 1]) {
            min = Integer.MAX_VALUE;
            for (int i = 0; i < index - 1; i++) {
                min = Math.min(min, values[i]);
            }
        }
        index--;
    }

    public int top() {
        return values[index - 1];
    }

    public int min() {
        return min;
    }

    public void updateMin(int x) {
        min = Math.min(x, min);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
