package m1;

import java.util.Scanner;

public class m3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        String string = Integer.toBinaryString(num);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)=='0') {
                stringBuilder.append("d");
            }else {
                stringBuilder.append("r");
            }
        }
        System.out.println(stringBuilder);
    }
}
