//package sword_offer.L28;
//
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//
//public class jz37 {
//}
//
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
//class Test {
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(4);
//        root.right.right = new TreeNode(5);
//        String serialize = new Codec().serialize(root);
////        String serialize = "[5, 2, 3, null, null, 2, 4, 3, 1]";
//        new Codec().deserialize(serialize);
//    }
//}
//
//class Codec {
//    public String serialize(TreeNode root) {
//        return rserialize(root, "");
//    }
//
//    public TreeNode deserialize(String data) {
//        data = data.substring(0,data.length()-1);
//        String[] dataArray = data.split(",");
//        List<String> dataList = new LinkedList<>(Arrays.asList(dataArray));
//        return rdeserialize(dataList);
//    }
//
//    public String rserialize(TreeNode root, String str) {
//        if (root == null) {
//            str += "None,";
//        } else {
//            str += str.valueOf(root.val) + ",";
//            str = rserialize(root.left, str);
//            str = rserialize(root.right, str);
//        }
//        return str;
//    }
//
//    public TreeNode rdeserialize(List<String> dataList) {
//        if (dataList.get(0).equals("None")) {
//            dataList.remove(0);
//            return null;
//        }
//
//        TreeNode root = new TreeNode(Integer.valueOf(dataList.get(0)));
//        dataList.remove(0);
//        root.left = rdeserialize(dataList);
//        root.right = rdeserialize(dataList);
//
//        return root;
//    }
//}
//
