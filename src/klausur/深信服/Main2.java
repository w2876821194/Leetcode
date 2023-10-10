package klausur.深信服;

import java.util.*;

// 注意类名必须为 klausur.L深信服.Main, 不要有任何 package xxx 信息
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

//        while (in.hasNextInt()) {
//            list.add(in.nextInt());
//        }
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(3);

        int max = Integer.MIN_VALUE;
        int num = 0;

        for (int i = 0; i < list.size(); i++) {
            if (!set.contains(list.get(i))) {
                set.add(list.get(i));
                num++;
                max = Math.max(max, num);
            }else {
                set = new HashSet<>();
                set.add(list.get(i));
                num = 1;
            }
        }
        System.out.println(max);
    }
}
