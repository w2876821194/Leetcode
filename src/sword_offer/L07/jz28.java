package sword_offer.L07;

public class jz28 {
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return judge(root.left, root.right);
    }

    public boolean judge(TreeNode A, TreeNode B) {
        if (A == null && B == null) {
            return true;
        }
        if (A != null && B != null && A.val == B.val) {
            return judge(A.left, B.right) && judge(A.right, B.left);
        }
        return false;
    }
}
