//package sword_offer.L27;
//
//import java.util.ArrayDeque;
//import java.util.PriorityQueue;
//import java.util.Queue;
//
//public class jz59_2 {
//}
//
//class MaxQueue {
//    Queue<Integer> priorityQueue = new PriorityQueue<>((i, j) -> j - i);
//    Queue<Integer> queue = new ArrayDeque<>();
//
//    public MaxQueue() {
//    }
//
//    public int max_value() {
//        if (queue.size() == 0 || priorityQueue.size() == 0) {
//            return -1;
//        }
//        return priorityQueue.peek();
//    }
//
//    public void push_back(int value) {
//        priorityQueue.offer(value);
//        queue.offer(value);
//    }
//
//    public int pop_front() {
//        if (queue.size() == 0 || priorityQueue.size() == 0) {
//            return -1;
//        }
//        priorityQueue.remove(queue.peek());
//        return queue.poll();
//    }
//}
//
///**
// * Your MaxQueue object will be instantiated and called as such:
// * MaxQueue obj = new MaxQueue();
// * int param_1 = obj.max_value();
// * obj.push_back(value);
// * int param_3 = obj.pop_front();
// */
