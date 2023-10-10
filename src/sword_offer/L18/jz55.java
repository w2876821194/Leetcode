//package sword_offer.L18;
//
//public class jz55 {
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
//class klausur.L深信服.Solution {
//    boolean flag = true;
//
//    public boolean isBalanced(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        dfs(root);
//        return flag;
//    }
//
//    public int dfs(TreeNode treeNode) {
//        if (treeNode == null) {
//            return 0;
//        }
//
//        int left = dfs(treeNode.left);
//        int right = dfs(treeNode.right);
//        if (Math.abs(left - right) > 1) {
//            flag = false;
//        }
//        return Math.max(left, right) + 1;
//    }
//}
