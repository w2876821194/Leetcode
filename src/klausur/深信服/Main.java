package klausur.深信服;

import java.util.*;

// 注意类名必须为 klausur.L深信服.Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (n-- > 0) {
            int m = in.nextInt();

            Map<Integer, Integer[]> map = new HashMap<>();
            int[][] nums = new int[m][2];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < 2; j++) {
                    nums[i][j] = in.nextInt();
                }
                map.put(nums[i][1], new Integer[]{nums[i][0], i});
            }
            List<Integer> list = new ArrayList<>();

            int i = 0;
            while (list.size() != m) {
                Integer integer = map.get(i)[0];
                list.add(integer);
                i = map.get(i)[1] + 1;
            }

            list.forEach(j -> System.out.print(j + " "));
            System.out.println();
        }

    }
}
