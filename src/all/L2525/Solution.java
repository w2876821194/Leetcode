package all.L2525;

import java.util.ArrayList;
import java.util.List;

class Solution {
    int M = (int) Math.pow(10, 4);
    long L = (long) Math.pow(10, 9);

    public String categorizeBox(int length, int width, int height, int mass) {
        List<String> list = new ArrayList<>();

        System.out.println((long) length * width * height);
        if (length >= M || width >= M || height >= M || (long) length * width * height >= L) {
            list.add("Bulky");
        }
        if (mass >= 100) {
            list.add("Heavy");
        }
        if (list.contains("Bulky") && list.contains("Heavy")) {
            return "Both";
        } else if (list.contains("Bulky")) {
            return "Bulky";
        } else if (list.contains("Heavy")) {
            return "Heavy";
        } else {
            return "Neither";
        }
    }
}
