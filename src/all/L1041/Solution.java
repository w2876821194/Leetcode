package all.L1041;

public class Solution {
    public static boolean isRobotBounded(String instructions) {
        StringBuilder stringBuilder = new StringBuilder(instructions)
                .append(instructions)
                .append(instructions)
                .append(instructions);
        instructions = stringBuilder.toString();
        int x = 0, y = 0;
        int[][] array = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int flag = 0;
        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == 'L') {
                flag = (flag - 1 + 4) % 4;
            } else if (instructions.charAt(i) == 'R') {
                flag = (flag + 1 + 4) % 4;
            } else {
                x += array[flag][0];
                y += array[flag][1];
            }
        }
        if (x == 0 && y == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
//        String GGLLGG = "GGLLGG";
//        String GGLLGG = "GG";
        String GGLLGG = "GL";
        System.out.println(isRobotBounded(GGLLGG));
    }

}
