//package sword_offer.L28;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Codec {
//    public String serialize(TreeNode root) {
//        if (root == null) {
//            return null;
//        }
//        List<String> list = new ArrayList<>();
//        dfs(root, list);
//        return list.toString();
//    }
//    public void dfs(TreeNode node, List<String> list) {
//        if (node == null) {
//            list.add("null");
//            return;
//        }
//        list.add(String.valueOf(node.val));
//        dfs(node.left, list);
//        dfs(node.right, list);
//    }
//
//    public TreeNode deserialize(String data) {
//        if (data == null) {
//            return null;
//        }
//        List<String> split = Arrays
//                .stream(data.substring(1, data.length() - 1).split(", "))
//                .collect(Collectors.toList());
//        return setUp(split);
//    }
//
//    public TreeNode setUp(List<String> list) {
//        if (list.get(0).equals("null")) {
//            list.remove(0);
//            return null;
//        }
//        TreeNode treeNode = new TreeNode(Integer.parseInt(list.get(0)));
//        list.remove(0);
//        treeNode.left = setUp(list);
//        treeNode.right = setUp(list);
//        return treeNode;
//    }
//}
