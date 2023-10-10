package all.L2511;

class Solution {
    public int captureForts(int[] forts) {
        int max = 0;
        int index = 0;
        while (index < forts.length) {
            if (forts[index] != 0) {
                int i = 1;
                while (index + i < forts.length && forts[index + i] == 0) {
                    i++;
                }
                if (index + i < forts.length && forts[index] == -forts[index + i]) {
                    max = Math.max(max, i - 1);
                }
                index += i;
            } else {
                index++;
            }
        }
        return max;
    }
}
