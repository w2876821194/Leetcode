public class Solution {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    int[] arr;
    int num;

    public int[] searchRange(int[] arr, int num) {
        this.arr = arr;
        this.num = num;

        int l = 0;
        int r = arr.length - 1;
        gcd(l, r);
        if (max == Integer.MIN_VALUE && min == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        } else {
            return new int[]{min, max};
        }

    }

    public void gcd(int l, int r) {
        if (l > r) {
            return;
        }

        int mid = (l + r) / 2;
        if (arr[l] == num && arr[r] == num) {
            max = Math.max(max, r);
            min = Math.min(min, l);
        }

        if (arr[mid] <= num && arr[r] >= num) {
            if (arr[mid] == num) {
                min = Math.min(min, mid);
                max = Math.max(max, mid);
            }
            gcd(mid + 1, r);
        }
        if (arr[mid] >= num && arr[l] <= num) {
            if (arr[l] == num && arr[r] == num) {
                max = Math.max(max, r);
                min = Math.min(min, l);
            }
            gcd(l, mid - 1);
        }
        if (arr[mid] == num) {
            max = Math.max(max, mid);
            min = Math.min(min, mid);
        }
    }
}

class Test {
    public static void main(String[] args) {
        new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
    }
}
