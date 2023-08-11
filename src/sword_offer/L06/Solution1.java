//package sword_offer.L06;
//
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Queue;
//
//public class Solution1 {
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
//    Queue<TreeNode> queue = new ArrayDeque<>();
//    List<Integer> list = new ArrayList<>();
//
//    public int[] levelOrder(TreeNode root) {
//        if (root == null) {
//            return new int[0];
//        }
//        queue.offer(root);
//        bfs();
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }
//
//    public void bfs() {
//        while (queue.size() != 0) {
//            TreeNode root = queue.poll();
//            list.add(root.val);
//            if (root.left != null) {
//                queue.offer(root.left);
//            }
//            if (root.right != null) {
//                queue.offer(root.right);
//            }
//        }
//    }
//}
////class Solution {
////    List<Integer> list = new ArrayList<>();
////    public int[] levelOrder(TreeNode root) {
////        bfs(root);
////        return list.stream().mapToInt(Integer::intValue).toArray();
////    }
////    public void bfs(TreeNode root) {
////        if (root == null) {
////            return;
////        }
////        list.add(root.val);
////
////        bfs(root.left);
////        bfs(root.right);
////
////    }
////}
