package sword_offer.L16;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class jz61 {
}

class Solution {
    public boolean isStraight(int[] nums) {
        AtomicInteger num = new AtomicInteger(0);
        Set<Integer> set = Arrays.stream(nums)
                .boxed()
                .filter(i -> {
                    num.addAndGet(i == 0 ? 1 : 0);
                    return i != 0;
                })
                .collect(Collectors.toSet());

        if (set.size() + num.get() != nums.length) {
            return false;
        }
        int max = set.stream().max(Comparator.naturalOrder()).get();
        for (int i = 0; i < 5; i++) {
            System.out.println(max - i);
            if (!set.contains(max - i)) {
                if (num.get() == 0) {
                    return false;
                } else {
                    num.decrementAndGet();
                }
            }
        }
        return true;
    }
}
