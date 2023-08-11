package sword_offer.L04;

public class Solution3 {
}

class Solutio2 {
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length && nums[i] == i++) {
            i++;
        }
        return i;
    }
}

class Test {
    public static void main(String[] args) {
        new Solutio2().missingNumber(new int[]{0, 1, 3});
    }
}
