//package sword_offer.L07;
//
//public class jz27 {
//}
//
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
//    public TreeNode mirrorTree(TreeNode root) {
//        if (root == null) {
//            return null;
//        }
//        TreeNode treeNode = new TreeNode(root.val);
//        return update(root, treeNode);
//
//    }
//    public TreeNode update(TreeNode A, TreeNode B) {
//        if (A.left != null) {
//            B.right = new TreeNode(A.left.val);
//            update(A.left, B.right);
//        }
//        if (A.right != null) {
//            B.left = new TreeNode(A.right.val);
//            update(A.right, B.left);
//        }
//        return B;
//    }
//}
