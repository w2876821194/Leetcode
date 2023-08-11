package all.L147;

public class Solution {
    public static int longestDecomposition(String text) {
        int num = 0;
        int n = text.length();
        int j = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i>=n/2) {
                if (n%2!=0) {
                    if (stringBuilder.length() == 0) {
                        num++;
                        break;
                    }else {
                        num++;
                        break;
                    }
                }else {
                    if (stringBuilder.length() == 0) {
                        break;
                    }else {
                        num++;
                        break;
                    }
                }
            }


            stringBuilder.append(text.charAt(i));
            String str = stringBuilder.toString();

            int indexA = j;
            int indexB = text.substring(i, n - j)
                    .lastIndexOf(str);

            if (indexB == -1) {
                continue;
            }
            indexB += i;

            if (indexB + str.length() + indexA == n) {
                num += 2;
                stringBuilder = new StringBuilder();
                j = i + 1;
            }
        }
        return num;
    }

    public static void main(String[] args) {
//        String str = "ghiabcdefhelloadamhelloabcdefghi";//7
//        String str = "merchant";//1
//        String str = "aaa";//3
        String str = "antaprezatepzapreanta";
//        String str = "qrcnnqrc";//4
        System.out.println(longestDecomposition(str));
    }

}
