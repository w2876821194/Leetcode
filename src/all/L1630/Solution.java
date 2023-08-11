package all.L1630;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> booleans = new ArrayList<Boolean>();

        for (int i = 0; i < l.length; i++) {
            int length = r[i] - l[i] + 1;
            int[] a = new int[length];
            int[] sum = new int[length];
            System.arraycopy(nums, l[i], a, 0, length);
            Arrays.sort(a);
            sum[0] = a[0];

            for (int j = 1; j < a.length; j++) {
                a[j] = a[j] - sum[j - 1];
                sum[j] = a[j] + sum[j - 1];
            }
            a[0] = a[1];

            int max = Arrays.stream(a).max().getAsInt();
            int min = Arrays.stream(a).min().getAsInt();

            if (max == min) {
                booleans.add(true);
            } else {
                booleans.add(false);
            }

            System.out.println();
        }


        return booleans;
    }

    public static void main(String[] args) {
//        int[] nums = {4, 6, 5, 9, 3, 7}, l = {0, 0, 2}, r = {2, 3, 5};
        int[] nums = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10}, l = {0,1,6,4,8,7}, r = {4,4,9,7,9,10};
        checkArithmeticSubarrays(nums, l, r);
    }
}
