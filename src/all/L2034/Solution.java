package all.L2034;

import java.util.*;

class StockPrice {
    Map<Integer, Integer[]> map;
    Queue<Integer[]> maxQueue;
    Queue<Integer[]> minQueue;

    int maxTime;


    public StockPrice() {
        map = new HashMap<>();
        maxQueue = new PriorityQueue<>((i, j) -> j[1] - i[1]);
        minQueue = new PriorityQueue<>((i, j) -> i[1] - j[1]);
        maxTime = 0;
    }

    public void update(int timestamp, int price) {
        maxTime = Math.max(timestamp, maxTime);
        Integer[] integers = new Integer[]{timestamp, price};
        map.put(integers[0], integers);
        maxQueue.offer(integers);
        minQueue.offer(integers);
    }

    public int current() {
        return map.get(maxTime)[1];
    }

    public int maximum() {
        while (true) {
            Integer[] poll = maxQueue.peek();
            if (map.containsKey(poll[0]) && Objects.equals(map.get(poll[0])[1], poll[1])) {
                return poll[1];
            }
            maxQueue.poll();
        }
    }

    public int minimum() {
        while (true) {
            Integer[] poll = minQueue.peek();
            if (map.containsKey(poll[0]) && Objects.equals(map.get(poll[0])[1], poll[1])) {
                return poll[1];
            }
            minQueue.poll();
        }
    }
}

class Test {
    public static void main(String[] args) {
        StockPrice obj = new StockPrice();
        obj.update(1, 1);
        obj.update(1, 2);
    }
}
/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */
