package m1;

import java.util.Arrays;
import java.util.Scanner;

public class m4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int num = scanner.nextInt();
        int[] array = new int[num];
        int k = scanner.nextInt();



        int min = 0, avg = 0;
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.stream(array).average());

    }
}
