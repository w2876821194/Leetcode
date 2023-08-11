package all.interview;

public class Solution6 {
    public static int minimumRecolors(String blocks, int k) {
        int[] array = new int[blocks.length()];
        int min = blocks.length();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (blocks.charAt(i) == 'B') {
                    array[i] = 0;
                } else {
                    array[i] = 1;
                }
                continue;
            }
            if (blocks.charAt(i) == 'B') {
                array[i] = array[i - 1];
            } else {
                array[i] = array[i - 1] + 1;
            }
        }

        for (int i = k - 1; i < blocks.length(); i++) {
            if (i == k - 1) {
                min = Math.min(min, array[i]);
                continue;
            }
            min = Math.min(min, array[i] - array[i - k]);
        }
        return min;
    }

    public static void main(String[] args) {
        String str = "W";
        int k = 1;
        System.out.println(minimumRecolors(str, k));
    }
}
