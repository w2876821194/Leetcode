package all.L2652;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

class Solution {
    public int sumOfMultiples(int n) {
        AtomicInteger sum = new AtomicInteger();
        IntStream.rangeClosed(1, n).forEach(i -> {
            sum.addAndGet((i % 3 == 0 || i % 5 == 0 || i % 7 == 0 ? i : 0));
        });
        return sum.get();
    }
}
