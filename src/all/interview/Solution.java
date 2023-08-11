package all.interview;

/**
 * 面试题 05.02. 二进制数转字符串
 * 二进制数转字符串。给定一个介于0和1之间的实数（如0.72），类型为double，打印它的二进制表达式。如果该数字无法精确地用32位以内的二进制表示，则打印“ERROR”。
 */
public class Solution {
    public static String printBin(double num) {
        StringBuilder str = new StringBuilder();
        str.append("0.");
        double q = 2;
        double p = num; // 0.625
        while (p > 0) {
            if (p >= 1 / q) {
                p -= 1 / q; //0.125
                str.append("1");
            } else {
                if (str.toString().length() > 32) {
                    return "ERROR";
                }
                str.append("0");
            }
            q *= 2;  //4
        }
        return str.toString();
    }


    public static void main(String[] args) {
        System.out.println(printBin(0.625));
    }

}
