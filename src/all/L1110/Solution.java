package all.L1110;


import java.util.*;
import java.util.stream.Collectors;

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
    // bfs
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> list = new ArrayList<>();
        Map<Integer, Integer> map = Arrays.stream(to_delete).boxed().collect(Collectors.toMap(a -> a, b -> 1));

        Queue<TreeNode> queue = new ArrayDeque<>();
        if (!map.containsKey(root.val)) {
            list.add(root);
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            TreeNode left = poll.left;
            TreeNode right = poll.right;

            int val = poll.val;
            boolean flag = false;
            if (map.containsKey(val)) {
                flag = true;
            }

            if (left != null) {
                if (flag && !map.containsKey(left.val)) {
                    list.add(left);
                }
                queue.add(left);
                if (map.containsKey(left.val)) {
                    poll.left = null;
                }
            }
            if (right != null) {
                if (flag && !map.containsKey(right.val)) {
                    list.add(right);
                }
                queue.add(right);
                if (map.containsKey(right.val)) {
                    poll.right = null;
                }
            }
        }
        return list;
    }

    // dfs
//    public List<TreeNode> delNodes2(TreeNode root, int[] to_delete) {
//
//    }

}

class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(3);
        int[] to_delete = {3, 5};
        new Solution().delNodes(root, to_delete);
    }
}
//[1,2,null,4,3]
//[2,3]

//[1,2,3,4,5,6,7]
//[3,5]

//[1,2,4,null,3]
//[3]

//[1,2,3,null,null,null,4]
//[2,1]
