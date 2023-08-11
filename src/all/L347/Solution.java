package all.L347;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        PriorityQueue<Integer[]> priorityQueue = new PriorityQueue<>((a,b)-> b[1]-a[1]);
        for (Integer integer : map.keySet()) {
            priorityQueue.add(new Integer[]{integer,map.get(integer)});
        }
        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = priorityQueue.poll()[0];
        }
        return array;
    }
}
