//package sword_offer.L20;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class jz07 {
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
//class klausur.L深信服.Solution {
//    int[] preorder;
//    int[] inorder;
//    Map<Integer, Integer> map = new HashMap<>();
//
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        this.preorder = preorder;
//        this.inorder = inorder;
//        build();
//        return gcd(0, 0, inorder.length - 1);
//    }
//    private void build() {
//        for (int i = 0; i < inorder.length; i++) {
//            int q = inorder[i];
//            map.put(q, i);
//        }
//    }
//    public TreeNode gcd(int root, int l, int r) {
//        if (l > r) {
//            return null;
//        }
//        int index = map.get(preorder[root]);
//        TreeNode node = new TreeNode(preorder[root]);
//        node.left = gcd(root + 1, l, index - 1);
//        node.right = gcd((root + 1) + (index - l), index + 1, r);
//        return node;
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        int[] p = new int[]{3, 9, 20, 15, 7};
//        int[] q = new int[]{9, 3, 15, 20, 7};
//        new klausur.L深信服.Solution().buildTree(p, q);
//    }
//}
