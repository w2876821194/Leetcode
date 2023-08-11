package m1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class m1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] array = new int[num];
        int k = scanner.nextInt();


        int min = 0, avg = 0;
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < 0) {
                min++;
            }
        }
        Arrays.sort(array);

        if (k == min) {
            avg = Arrays.stream(array).map((i) -> Math.min(i, 0)).sum();
            avg += Arrays.stream(array).map((i) -> Math.max(i, 0)).sum();
            System.out.println(avg);
        } else if (k < min) {

        }


    }
}
