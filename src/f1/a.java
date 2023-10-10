package f1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class a {
}

class Solution {
    public int countKSubsequencesWithMaxBeauty(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (Character c : map.keySet()) {
            queue.offer(map.get(c));
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += queue.poll();
        }
        return sum;
    }
}
