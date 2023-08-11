package all.L2418;

import java.util.*;

public class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        Integer[] integers = new Integer[names.length];
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
            integers[i] = heights[i];
        }

        Arrays.sort(integers, (o1, o2) -> o2-o1);

        for (int i = 0; i < heights.length; i++) {
            names[i] = map.get(integers[i]);
        }
        return names;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        solution.sortPeople(names, heights);
    }


}
