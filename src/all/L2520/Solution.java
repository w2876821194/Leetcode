package all.L2520;

class Solution {
    public int countDigits(int num) {
        int sum = 0;
        for (long i = 10; i < num * 10L; i *= 10) {
            sum += num % ((num / (i / 10)) % 10) == 0 ? 1 : 0;
        }
        return sum;
    }
}

class Test {
    public static void main(String[] args) {
        new Solution().countDigits(577484251);
    }
}
