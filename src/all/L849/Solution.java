package all.L849;

class Solution {
    public int maxDistToClosest(int[] seats) {
        int p = 0;
        int maxL = -1;
        int maxR;
        int max = Integer.MIN_VALUE;
        while (true) {
            int i = 0;
            while (p < seats.length && seats[p] == 0) {
                i++;
                p++;
            }
            if (maxL == -1) {
                maxL = i;
            } else if (p == seats.length) {
                maxR = i;
                break;
            } else {
                max = Math.max(max, i);
            }
            p++;
        }
        return Math.max(Math.max(maxR, maxL), max / 2 + max % 2);
    }
}

class Test {
    public static void main(String[] args) {
        int[] seats = {1, 0, 0, 0, 1, 0, 1};
        System.out.println(new Solution().maxDistToClosest(seats));
    }
}
