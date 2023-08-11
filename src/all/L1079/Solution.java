package all.L1079;

// Definition for a binary tree node.
// public
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
    public int maxSumBST(TreeNode root) {
        int sum = dfs(root).sum;
        return Math.max(sum, 0);
    }

    public R dfs(TreeNode root) {
        if (root.val<=0) {
            return new R(0,false);
        }
        boolean flag = isYes(root);
        int maxSum = 0;

        R left = root.left != null ? dfs(root.left) : new R(0, true);
        R right = root.right != null ? dfs(root.right) : new R(0, true);

        if (flag && left.flag && right.flag) {
            maxSum = Math.max(left.sum + right.sum + root.val, Math.max(left.sum, right.sum));
            flag = maxSum == left.sum + right.sum + root.val;
        } else {
            maxSum = Math.max(left.sum, right.sum);
        }
        System.out.println("val:" + root.val + "maxSum:" + maxSum);
        return new R(maxSum, flag);
    }


    public boolean isYes(TreeNode root) {
//        boolean flag = false;
        boolean flag1 = root.left == null || root.left.val < root.val;
        boolean flag2 = root.right == null || root.right.val > root.val;
        if (flag1 && flag2) {
            return true;
        }
        return false;
    }

    class R {
        public R(int sum, boolean flag) {
            this.sum = sum;
            this.flag = flag;
        }

        public int sum;
        public boolean flag;
    }
}

class A {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(4);
        root.right = new TreeNode(10);
//        root.left.left = new TreeNode(2);
//        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(-5);
        root.right.right = new TreeNode(20);
//        root.left.left.left = null;
//        root.left.left.right = null;
//        root.left.right.left = null;
//        root.left.right.right = null;
//        root.right.left.left = null;
//        root.right.left.right = new TreeNode(4);
//        root.right.right.left = new TreeNode(4);
//        root.right.right.right = new TreeNode(6);

        new Solution().maxSumBST(root);

    }
}

