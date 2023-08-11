package sword_offer.L06;

import java.util.*;

public class Solution2 {
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
    Queue<TreeNode> queue = new ArrayDeque<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        queue.offer(root);
        return bfs();
    }
    public List<List<Integer>> bfs() {
        List<List<Integer>> listList = new ArrayList<>();
        while (queue.size() != 0) {
            int n = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
            listList.add(list);
        }
        return listList;
    }
}
