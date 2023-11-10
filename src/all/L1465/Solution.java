package all.L1465;

import java.util.Arrays;

class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        long heightMax = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length - 1]);
        long weightMax = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length - 1]);

        for (int i = 1; i < horizontalCuts.length; i++) {
            heightMax = Math.max(heightMax, horizontalCuts[i] - horizontalCuts[i - 1]);
        }
        for (int i = 1; i < verticalCuts.length; i++) {
            weightMax = Math.max(weightMax, verticalCuts[i] - verticalCuts[i - 1]);
        }
        return (int) ((heightMax * weightMax) % 1000000007);

    }
}
