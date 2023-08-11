package all.L1043;


class Solution {
    int[] arr, indexSum;
    int k = 0;

    public int maxSumAfterPartitioning(int[] arr, int k) {
        this.arr = arr;
        indexSum = new int[arr.length];
        this.k = k;
        return dfs(0);
    }

    private int dfs(int i) {
        int sum = 0;
        int max = 0;

        for (int j = i; j < arr.length && j < i + k; j++) {
            max = Math.max(max, arr[j]);
            sum = Math.max(sum, max * (j - i + 1) + (j + 1 < arr.length && indexSum[j + 1] != 0 ? indexSum[j + 1] : dfs(j + 1)));
            sum = Math.max(sum, max * (j - i + 1) + dfs(j + 1));
        }
        if (i < arr.length) indexSum[i] = sum;
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 18, 17, 1};
        int k = 3;
        System.out.println(solution.maxSumAfterPartitioning(arr, k));
    }

}

// 1,4,1,5,7,3,6,1,9,9,3
// 1,4,1,5,7,9,9,9,9,9,9
// 1,7,7,7,7,9,9,9,9,9,9

