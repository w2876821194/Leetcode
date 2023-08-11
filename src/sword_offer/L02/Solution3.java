//package sword_offer.L02;
//
//import java.util.HashMap;
//import java.util.Map;
//
//// Definition for a Node.
//class Node {
//    int val;
//    Node next;
//    Node random;
//
//    public Node(int val) {
//        this.val = val;
//        this.next = null;
//        this.random = null;
//    }
//}
//
//class Solution {
//    Node root = new Node(0);
//    Node node = root;
//    Map<Node, Node> map = new HashMap<>();
//
//    public Node copyRandomList(Node head) {
//        copy(head);
//        return node.next;
//    }
//
//    public void copy(Node node) {
//        if (node == null) {
//            return;
//        }
//        root.next = copyNode(node);
//        root = root.next;
//        map.put(node, root);
//        copy(node.next);
//        map.get(node).random = map.get(node.random);
//    }
//
//    public Node copyNode(Node node) {
//        return new Node(node.val);
//    }
//}
