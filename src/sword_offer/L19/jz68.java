//package sword_offer.L19;
//
//public class jz68 {
//}
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}
//
//class Solution {
//    TreeNode p;
//    TreeNode q;
//    boolean flag;
//    TreeNode treeNode;
//
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if (root == null) {
//            return null;
//        }
//        this.p = p;
//        this.q = q;
//        dfs(root);
//        return treeNode;
//    }
//
//    public boolean dfs(TreeNode root) {
//        if (root == null) {
//            return false;
//        }
//        boolean index = root.val == p.val || root.val == q.val;
//        boolean left = dfs(root.left);
//        boolean right = dfs(root.right);
//
//        if ((left && right) || (left && index) || (right && index)) {
//            flag = true;
//            treeNode = root;
//            return true;
//        } else {
//            return left || right || index;
//        }
//    }
//}
