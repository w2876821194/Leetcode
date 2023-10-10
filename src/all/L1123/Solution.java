package all.L1123;

import java.util.*;

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
    Map<TreeNode, Integer> map = new HashMap<>();

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if (root == null) {
            return null;
        }
        map.put(null, -1);
        setIndex(root);
        return gcd(root);
    }

    public TreeNode gcd(TreeNode treeNode) {
        if (treeNode == null) {
            return null;
        }
        Integer leftIndex = map.get(treeNode.left);
        Integer rightIndex = map.get(treeNode.right);

        if (Objects.equals(leftIndex, rightIndex)) {
            return treeNode;
        }
        return leftIndex > rightIndex ? gcd(treeNode.left) : gcd(treeNode.right);
    }

    public int setIndex(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int i = setIndex(treeNode.left);
        int j = setIndex(treeNode.right);
        if (i == j) {
            map.put(treeNode, i + 1);
        } else map.put(treeNode, Math.max(i, j) + 1);
        return map.get(treeNode);
    }
}
