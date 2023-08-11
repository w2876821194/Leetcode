package all.KGU;

import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();

        for (int i = 0; i < n1; i++) {

            int n2 = scanner.nextInt();
            int[] arr = new int[n2];

            for (int j = 0; j < n2; j++) {
                arr[j] = scanner.nextInt();
            }

            int n3 = scanner.nextInt();
            int sum = 0;
            int max = 0;

            for (int j = 0; j < n2; j++) {
                if (j < n3) {
                    sum += arr[j];
                } else {
                    sum = sum + arr[j] - arr[j - n3];
                }
                max = Math.max(max, sum);
            }
            System.out.println(max);
        }
    }
}

