package all.L605;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // flowerbed = [1,0,0,0,1], n = 1
        int num = 0;
        int i = 0;
        while (i < flowerbed.length) {
            while (i < flowerbed.length && flowerbed[i] == 1) {
                i++;
            }
            int j = 1;
            while (i + j < flowerbed.length && flowerbed[i + j] == 0) {
                j++;
            }
            if (i == 0 && i + j == flowerbed.length) {
                num += (j + 1) / 2;
            } else if (i == 0 || i + j == flowerbed.length) {
                System.out.println(j / 2);
                num += Math.max(j / 2, 0);
            } else {
                int flag = j % 2 == 0 ? (j - 2) / 2 : j / 2;
                System.out.println(":" + flag);
                num += Math.max(flag, 0);
            }
            i += j;
        }
        return num >= n;
    }
}
