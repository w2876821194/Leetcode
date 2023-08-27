package all.L1448;


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
    int num = 0;

    public int goodNodes(TreeNode root) {
        gcd(root, Integer.MIN_VALUE);
        return num;
    }

    public void gcd(TreeNode treeNode, int max) {
        if (treeNode == null) {
            return;
        }
        if (treeNode.val >= max) {
            num++;
            gcd(treeNode.left, treeNode.val);
            gcd(treeNode.right, treeNode.val);
        } else {
            gcd(treeNode.left, max);
            gcd(treeNode.right, max);
        }
    }
}
