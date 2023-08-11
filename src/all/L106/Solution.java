package all.L106;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class Solution {
    public static int maxAncestorDiff(TreeNode root) {
        return dfs(root,0,5001);
    }

    public static int dfs(TreeNode root, int max, int min) {
        if (root == null) {
            return max-min;
        }
        int val = root.val;

        max = Math.max(max, val);
        min = Math.min(min, val);

        TreeNode left = root.left;
        TreeNode right = root.right;

        int num = max-min;
        num = Math.max(num,dfs(left,max,min));
        num = Math.max(num,dfs(right,max,min));
        return num;
    }

}


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
