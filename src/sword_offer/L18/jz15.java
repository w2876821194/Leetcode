//package sword_offer.L18;
//
//import java.util.ArrayDeque;
//import java.util.Queue;
//
//public class jz15 {
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
//
//    int flag = 0;
//
//    public int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        dfs(root);
//        return flag;
//    }
//
//    public void dfs(TreeNode node) {
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        queue.offer(node);
//        while (!queue.isEmpty()) {
//            int n = queue.size();
//            for (int i = 0; i < n; i++) {
//                TreeNode poll = queue.poll();
//                if (poll.left != null) {
//                    queue.offer(poll.left);
//                }
//                if (poll.right != null) {
//                    queue.offer(poll.right);
//                }
//            }
//            flag++;
//        }
//    }
//}
