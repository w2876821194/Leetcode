package all.L1015;

import java.math.BigInteger;

public class Solution {

    public int smallestRepunitDivByK(int k) {
        BigInteger i = BigInteger.valueOf(1);
        if (k == 1) {
            return 1;
        }
        if (k % 5 == 0 || k % 2 == 0) {
            return -1;
        }
        while (true) {
            i = i.multiply(BigInteger.valueOf(10)).add(BigInteger.ONE);

            i = i.multiply(BigInteger.TEN).add(BigInteger.ONE);


            if (i.mod(BigInteger.valueOf(k)).equals(BigInteger.ZERO)) {
                return String.valueOf(i).length();
            }
        }
    }

    public static void main(String[] args) {
        new Solution().smallestRepunitDivByK(23);
    }
}
