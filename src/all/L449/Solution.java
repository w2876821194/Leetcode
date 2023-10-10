package all.L449;

import java.util.*;
import java.util.stream.Collectors;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Codec {
    public String serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            if (poll == null) {
                stringBuilder.append("null").append("|");
                continue;
            }
            stringBuilder.append(poll.val).append("|");

            queue.offer(poll.left);
            queue.offer(poll.right);

        }
        return stringBuilder.toString();
    }

    public TreeNode deserialize(String data) {
        if (Objects.equals(data, "")) {
            return null;
        }
        Queue<String> split = Arrays.stream(data.split("\\|")).filter(i -> !Objects.equals("", i)).collect(Collectors.toCollection(LinkedList::new));

        TreeNode root = new TreeNode(Integer.parseInt(split.poll()));
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        // [2,1,3]
        while (!split.isEmpty()) {
            String polled = split.poll();
            TreeNode poll = queue.poll();
            if (!Objects.equals(polled, "null")) {
                TreeNode left = new TreeNode(Integer.parseInt(polled));
                queue.offer(left);
                poll.left = left;
            }
            polled = split.poll();
            if (!Objects.equals(polled, "null")) {
                TreeNode right = new TreeNode(Integer.parseInt(polled));
                queue.offer(right);
                poll.right = right;
            }
        }
        return root;
    }
}
class Test {
    public static void main(String[] args) {
        new Codec().deserialize("2|1|3|");
    }
}

