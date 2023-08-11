package sword_offer.L15;

import java.util.ArrayList;
import java.util.List;

public class jz54 {
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
    List<Integer> list = new ArrayList<>();
    int k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        println(root);
        return list.get(k - 1);
    }

    public void println(TreeNode root) {
        if (root == null) {
            return;
        }
        if (list.size() < k) {
            println(root.right);
        }
        if (list.size() < k) {
            list.add(root.val);
        }
        if (list.size() < k) {
            println(root.left);
        }
    }
}
