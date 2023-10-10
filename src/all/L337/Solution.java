package all.L337;


import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    Map<TreeNode, Integer> map = new HashMap<>();

    public int rob(TreeNode root) {
        return dfs(root);
    }

    public int dfs(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        if (map.containsKey(treeNode)) {
            return map.get(treeNode);
        }

        int max1 = dfs(treeNode.left) + dfs(treeNode.right);

        int max2 = treeNode.val;
        if (treeNode.left != null) {
            max2 += dfs(treeNode.left.left);
            max2 += dfs(treeNode.left.right);
        }
        if (treeNode.right != null) {
            max2 += dfs(treeNode.right.left);
            max2 += dfs(treeNode.right.right);
        }
        map.put(treeNode, Math.max(max1, max2));
        return map.get(treeNode);
    }
}
