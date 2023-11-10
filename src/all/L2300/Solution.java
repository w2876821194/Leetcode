package all.L2300;

import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int num = spells[i];
            int left = 0;
            int right = potions.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;

                if ((long) potions[mid] * num >= success) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            spells[i] = potions.length - right - 1;
        }
        return spells;
    }
}

class Test {
    public static void main(String[] args) {
//        int[] spells = {5, 1, 3}, potions = {1, 2, 3, 4, 5};
//        int success = 7;
        int[] spells = {3, 1, 2}, potions = {8, 5, 8};
        int success = 16;
        new Solution().successfulPairs(spells, potions, success);
    }
}
