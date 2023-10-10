//package sword_offer.L15;
//
//import java.util.*;
//
//public class jz34 {
//}
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
//
//class klausur.L深信服.Solution {
//    List<List<Integer>> listList = new ArrayList<>();
//    int target;
//
//    public List<List<Integer>> pathSum(TreeNode root, int target) {
//        if (root == null) {
//            return new ArrayList<>();
//        }
//        this.target = target;
//        dfs(root, new ArrayList<>(), 0);
//        return listList;
//    }
//
//    public void dfs(TreeNode root, List<Integer> list, int sum) {
//        List<Integer> treeNodes = new ArrayList<>(list);
//        treeNodes.add(root.val);
//        if (root.left == null && root.right == null) {
//            if (root.val + sum == target) {
//                listList.add(treeNodes);
//            }
//        } else if (root.left != null && root.right != null) {
//            dfs(root.left, treeNodes, sum + root.val);
//            dfs(root.right, treeNodes, sum + root.val);
//        } else if (root.left != null) {
//            dfs(root.left, treeNodes, sum + root.val);
//        } else {
//            dfs(root.right, treeNodes, sum + root.val);
//        }
//    }
//}
