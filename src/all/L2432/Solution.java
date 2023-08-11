package all.L2432;

public class Solution {

    public int hardestWorker(int n, int[][] logs) {
        int max = logs[0][1];
        int idMax = logs[0][0];
        for (int i = 1; i < logs.length; i++) {
            if (logs[i][1] - logs[i - 1][1] > max) {
                max = logs[i][1] - logs[i - 1][1];
                idMax = logs[i][0];
            }else if (logs[i][1] - logs[i - 1][1] == max) {
                idMax = Math.min(idMax, logs[i][0]);
            }
        }
        return idMax;
    }

    public static void main(String[] args) {

        int n = 70;
        int[][] logs = {{36,3},{1,5},{12,8},{25,9},{53,11},{29,12},{52,14}};
        Solution solution = new Solution();
        System.out.println(solution.hardestWorker(n, logs));
    }
}
