//package sword_offer.L15;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.PriorityQueue;
//
//public class jz36 {
//}
//
//class Node {
//    public int val;
//    public Node left;
//    public Node right;
//
//    public Node() {
//    }
//
//    public Node(int _val) {
//        val = _val;
//    }
//
//    public Node(int _val, Node _left, Node _right) {
//        val = _val;
//        left = _left;
//        right = _right;
//    }
//};
//
//class Solution {
//    PriorityQueue<Integer> queue = new PriorityQueue<>();
//    Map<Integer, Node> map = new HashMap<>();
//    Node head;
//    Node end;
//
//    public Node treeToDoublyList(Node root) {
//        if (root == null) {
//            return null;
//        }
//        traversing(root);
//        head = map.get(queue.peek());
//        build(head);
//        head.left = end;
//        end.right = head;
//        return head;
//    }
//
//    private void build(Node node1) {
//        if (!queue.isEmpty()) {
//            Integer poll = queue.poll();
//            Node node2 = map.get(poll);
//            node1.right = node2;
//            node2.left = node1;
//            build(node2);
//            return;
//        }
//        end = node1;
//    }
//
//    public void traversing(Node root) {
//        if (root != null) {
//            map.put(root.val, root);
//            queue.offer(root.val);
//            traversing(root.left);
//            traversing(root.right);
//        }
//    }
//}
