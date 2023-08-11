//package sword_offer.L07;
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
//    public boolean isSubStructure(TreeNode A, TreeNode B) {
//        if (A == null || B == null) {
//            return false;
//        }
//        return search(A, B);
//    }
//
//    public boolean search(TreeNode A, TreeNode B) {
//        boolean flag = false;
//        if (A != null && A.val == B.val) {
//            flag = judge(A, B);
//        }
//        if (!flag && A.left != null) {
//            flag = search(A.left, B);
//        }
//        if (!flag && A.right != null) {
//            flag = search(A.right, B);
//        }
//        return flag;
//    }
//
//
//    public boolean judge(TreeNode A, TreeNode B) {
//        boolean flagA = A != null;
//        boolean flagB = B != null;
//        // 当前节点A不存在B存在
//        if (flagA && flagB) { // 当前节点AB都存在
//            return A.val == B.val && judge(A.left, B.left) && judge(A.right, B.right);
//        }
//        return flagA || !flagB;
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        TreeNode A = new TreeNode(1);
//        A.left = new TreeNode(2);
//        A.left.left = new TreeNode(4);
//        A.right = new TreeNode(3);
//        TreeNode B = new TreeNode(3);
//        new Solution().isSubStructure(A,B);
//    }
//}
