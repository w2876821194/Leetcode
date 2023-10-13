package klausur.KGU;

import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int max = -10001;
        int min = 10001;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        System.out.println(max - min);

    }
}
