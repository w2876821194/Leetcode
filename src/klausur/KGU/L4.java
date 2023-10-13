package klausur.KGU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class L4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Integer[] array = new Integer[2];
            array[0] = scanner.nextInt();
            array[1] = scanner.nextInt();
            list.add(array);
        }

        list.sort((o1, o2) -> o1[0] + o1[1] - o2[0] - o2[1]);

        for (int i = 0; i < list.size(); i++) {
            Integer[] arr1 = list.get(i);

            for (int j = i + 1; j < list.size(); j++) {
                if (arr1 != list.get(j)) {
                    Integer[] arr2 = list.get(j);
                    if (arr1[1] >= arr2[0]) {
                        Integer[] temp = new Integer[2];
                        temp[0] = Math.min(arr1[0], arr2[0]);
                        temp[1] = Math.max(arr1[1], arr2[1]);
                        list.remove(arr1);
                        list.remove(arr2);
                        list.add(temp);
                        list.sort((o1, o2) -> o1[0] + o1[1] - o2[0] - o2[1]);
                        i = -1;
                        break;
                    }
                }
            }
        }

        list.sort((o1, o2) -> o1[0] + o1[1] - o2[0] - o2[1]);
        for (Integer[] a : list) {
            System.out.print(Arrays.toString(a) + " ");

        }
    }
}
