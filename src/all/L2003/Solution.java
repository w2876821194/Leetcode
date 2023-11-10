package all.L2003;

import java.util.*;

class Solution {
    /**
     * 子节点集合
     */
    List<Integer>[] children;
    /**
     * 是否遍历过
     */
    Set<Integer> geneSet;
    /**
     * 节点值
     */
    int[] nums;
    public int[] smallestMissingValueSubtree(int[] parents, int[] nums) {
        int n = parents.length;
        children = new List[n];
        geneSet = new HashSet<>();
        this.nums = nums;

        // 将所有节点缺失最小基因值先赋值为1
        int[] res = new int[n];
        Arrays.fill(res, 1);
        int iNode = 1, node = -1;

        for (int i = 0; i < n; i++) {
            children[i] = new ArrayList<>();
            if (nums[i] == 1) {
                node = i;
            }
        }
        // 查找节点值为1的节点
        for (int i = 1; i < n; i++) {
            children[parents[i]].add(i);
        }


        /*
          从为1的节点开始往上遍历,dfs进行深搜进行更新答案数组
         */
        while (node != -1) {
            dfs(node);
            while (geneSet.contains(iNode)) {
                iNode++;
            }
            res[node] = iNode;
            // 当前节点变为父节点
            node = parents[node];
        }
        return res;
    }

    public void dfs(int node) {
        // 走过则直接返回
        if (geneSet.contains(nums[node])) {
            return;
        }
        geneSet.add(nums[node]);
        // 遍历及其子节点
        for (int child : children[node]) {
            dfs(child);
        }
    }
}
class Test {
    public static void main(String[] args) {
        int[] parents = {-1,0,0,2}, nums = {1,2,3,4};
        new Solution().smallestMissingValueSubtree(parents,nums);
    }
}
