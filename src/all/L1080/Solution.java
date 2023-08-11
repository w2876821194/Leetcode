package all.L1080;

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


public class Solution {
    public int limit = 0;

    public TreeNode sufficientSubset(TreeNode root, int limit) {
        this.limit = limit;
        boolean dfs = dfs(root, 0);
        return dfs?root:null;
    }

    public boolean dfs(TreeNode root, int index) {

        int sum = index + root.val;
        boolean left = root.left != null && dfs(root.left, sum);
        boolean right = root.right != null && dfs(root.right, sum);

        boolean flag = false;
        if (root.left == null && root.right == null) {
            flag = sum >= limit;
        }
        if (!left) {
            root.left = null;
        }
        if (!right) {
            root.right = null;
        }

//        if (!flag) {
//
//        }
        return left || right || flag;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(-5);
        root.right = new TreeNode(-3);
        root.right.left = new TreeNode(4);
        new Solution().sufficientSubset(root,-1);
    }
}
