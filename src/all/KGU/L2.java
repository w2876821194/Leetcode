package all.KGU;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr.add(num);
            arr.sort(Comparator.comparingInt(o -> o));
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) == num) {
                    int p = 0;
                    while ((arr.size() > j + p + 1) && arr.get(j + p + 1) == num) {
                        p++;
                    }
                    System.out.print(j + p + 1);
                    System.out.print(" ");
                    break;
                }
            }
        }
    }
}
